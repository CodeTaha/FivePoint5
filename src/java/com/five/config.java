/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
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
   
   public void tryThis(HttpsURLConnection con) throws MalformedURLException, IOException{
   
    InputStream ins = con.getInputStream();
    InputStreamReader isr = new InputStreamReader(ins);
    BufferedReader in = new BufferedReader(isr);
 
    String inputLine;
 
    while ((inputLine = in.readLine()) != null)
    {
      System.out.println(inputLine);
    }
 
    in.close();
  
   }
}
