/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.five;

import com.google.gson.Gson;
import java.beans.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

/**
 *
 * @author root
 */
public class config {
    int appid=5152;
    String user="Five.5";
    int accessToken=2323323;
    String service_ticket="ST-wYd7Eo0ImlRBNMJ";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/fivepointfive";
   Statement stmt = null;
Connection conn = null;
   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root123";
   Gson gson=new Gson();
    
    public void print_https_cert(HttpsURLConnection con){
     System.out.println("chk0");
    if(con!=null){
			System.out.println("chk0.0");
      try {
          System.out.println("chk1");
	System.out.println("Response Code : " + con.getResponseCode());
	System.out.println("Cipher Suite : " + con.getCipherSuite());
	System.out.println("\n");
				
	 Certificate[] certs = con.getServerCertificates();
         System.out.println("chk2");
	for(Certificate cert : certs){
	   System.out.println("Cert Type : " + cert.getType());
	   System.out.println("Cert Hash Code : " + cert.hashCode());
	   System.out.println("Cert Public Key Algorithm : " 
                                    + cert.getPublicKey().getAlgorithm());
	   System.out.println("Cert Public Key Format : " 
                                    + cert.getPublicKey().getFormat());
	   System.out.println("\n");
	}
				
	} catch (SSLPeerUnverifiedException e) {
            System.out.println("ERR1");
	} catch (IOException e){
            System.out.println("ERR2 e="+e);
	}

     }
    else {System.out.println("CON was empty");}
   }
	
   public void print_content(HttpsURLConnection con){
	if(con!=null){
			
	try {
		
	   System.out.println("****** Content of the URL ********");			
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String input;
                
                while ((input = br.readLine()) != null){
                    System.out.println(input);
	   }}
				
	} catch (IOException e) {
	}
			
       }
		
   }
   
   public String tryThis(URL url) throws MalformedURLException, IOException{
   
    URLConnection urlConnection = url.openConnection();
			//urlConnection.setRequestProperty("Authorization", "Basic " + basicAuth);
                        //urlConnection.setRequestMethod("GET");
			InputStream is = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);

			int numCharsRead;
			char[] charArray = new char[1024];
			StringBuffer sb = new StringBuffer();
			while ((numCharsRead = isr.read(charArray)) > 0) {
				sb.append(charArray, 0, numCharsRead);
			}
			String result1 = sb.toString();

			System.out.println("*** BEGIN ***");
			System.out.println(result1);
			System.out.println("*** END ***");
                        return result1;
  
   }
   
   public config(){
        
        try{
           //STEP 2: Register JDBC driver
           Class.forName("com.mysql.jdbc.Driver");

           //STEP 3: Open a connection
           System.out.println("Connecting to a selected database...");
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           System.out.println("Connected database successfully...");
        }catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }//end try
        System.out.println("Goodbye!");
   }
   
   public String getdbHiker(String start, String end, String hiker,int user) throws SQLException{
        System.out.println(start+" "+end+" "+hiker);
        
        String query = "SELECT * FROM hikers where current='"+start+"' and dest<>current limit 1";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        
       
        // execute the query, and get a java resultset
        ResultSet rs = preparedStmt.executeQuery();
        String result="";
        if (rs.next())
        {
            int id = rs.getInt("hiker_id");
            String name = rs.getString("name");
            String origin = rs.getString("origin");
            String dest = rs.getString("dest");
            System.out.println("Search"+name);
            String users=rs.getString("users");
            ArrayList userarr=gson.fromJson(users,ArrayList.class);
            System.out.println("userarr"+userarr.toString());
            
            result="{\"name\":\""+name+"\",\"origin\":\""+origin+"\",\"dest\":\""+dest+"\",\"hiker_id\":\""+id+"\",\"users\":\""+users+"\"}";
        } else{
            query = " insert into hikers (name, origin, dest, users, current)"
             + " values (?, ?, ?, ?, ?)";
            // create the mysql insert preparedstatement
            ArrayList<Integer> users=new ArrayList();
            users.add(user);//{user};
            preparedStmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStmt.setString(1, hiker);
            preparedStmt.setString(2, start);
            preparedStmt.setString(3, end);
            preparedStmt.setString(4, gson.toJson(users));
            preparedStmt.setString(5, start);

            // execute the preparedstatement
            preparedStmt.executeUpdate();
            int last_inserted_id=0;
            System.out.println("worked");
            rs = preparedStmt.getGeneratedKeys();
                if(rs.next())
                {
                    last_inserted_id = rs.getInt(1);
                    System.out.println("worked "+ last_inserted_id);
                }
            result="{\"name\":\""+hiker+"\",\"origin\":\""+start+"\",\"dest\":\""+end+"\",\"hiker_id\":\""+last_inserted_id+"\",\"users\":\""+gson.toJson(users)+"\"}";
            
        }
        conn.close();
       return result;
   }

    String dropHiker(String current, int hiker_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
