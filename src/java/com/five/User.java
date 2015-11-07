/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.five;

import com.google.gson.Gson;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.HttpHeaders.USER_AGENT;

/**
 * REST Web Service
 *
 * @author root
 */
@Path("user")
public class User extends config{

    @Context
    private UriInfo context;
    Gson gson=new Gson();
    /**
     * Creates a new instance of GenericResource
     */
    public User() {
    }

    /**
     * Retrieves representation of an instance of com.test.User
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() throws MalformedURLException, IOException {
        //TODO return proper representation object
        String someStuff[]={"ssdsd","sdsdsd"};
        System.out.println(gson.toJson(someStuff));
        
        //String url = "http://www.google.com/search?q=mkyong";//"https://slush.ecom.finnair.com/api/oauth2.0/authorize?appId="+appid+"&user="+user+"&accessToken="+accessToken+"&redirect_url=jsd";
        StringBuilder result = new StringBuilder();
        //URL url = new URL("https://slush.ecom.finnair.com/api/oauth2.0/authorize?appId="+appid+"&user="+user+"&accessToken="+accessToken+"&redirect_url=jsd");
        URL url=new URL("https://slush.ecom.finnair.com/api/oauth2.0/authorize?appId=5152&user=Five.5&accessToken=2323323&redirect_url=jsd");
        //URL url=new URL("https://www.facebook.com/");
        System.out.println(url);
        try {

	     
	    HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
            String userpass = "slush" + ":" + "f1na350!";
            String basicAuth = "Basic " + Base64.encode(userpass.getBytes());
            con.setRequestProperty ("Authorization", basicAuth);
            //dumpl all cert info
            //print_https_cert(con);
               tryThis(con);	
            //dump all the content
            //print_content(con);
			
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.toJson(someStuff);
    }

    /**
     * PUT method for updating or creating an instance of User
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
    @GET
    @Path("profile/{profile}")
    @Produces("application/json")
    public String getprofile(@PathParam("profile")int ffn) {
        System.out.println(ffn);
        String profile="";
        switch(ffn){
            case 680297272:{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"25\",\"tierPointsCollected\":\"56000\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"PhilipIThorsen@armyspy.com\",\"firstName\":\"Philip\",\"lastName\":\"Thorsen\",\"memberNumber\":\"680297272\",\"mobilePhone\":\"+4571191342\",\"nextTier\":{\"flightsToNextTier\":\"54\",\"tierPointsToNextTier\":\"90000\"},\"status\":\"Active\",\"tierName\":\"Platinum\"}},\"bookings\":[{\"PNR\":\"5TQTBZ\"}]}";}break;
            case 680297686:{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"0\",\"tierPointsCollected\":\"0\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-30\"},\"email\":\"Shizue.Aoki@e2xample.com\",\"firstName\":\"Shizue\",\"lastName\":\"Aoki\",\"memberNumber\":\"680297686\",\"mobilePhone\":\"81413669538\",\"nextTier\":{\"flightsToNextTier\":\"24\",\"tierPointsToNextTier\":\"40000\"},\"status\":\"Active\",\"tierName\":\"Basic\"},\"bookings\":[{\"PNR\":\"5TOTOF\"}]}}";}break;
            case 680297298:{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"0\",\"tierPointsCollected\":\"0\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"Nami.Aoki@e2xample.com\",\"firstName\":\"Nami\",\"lastName\":\"Aoki\",\"memberNumber\":\"680297298\",\"mobilePhone\":\"81413669538\",\"nextTier\":{\"flightsToNextTier\":\"24\",\"tierPointsToNextTier\":\"40000\"},\"status\":\"Active\",\"tierName\":\"Basic\"}},\"bookings\":[{\"PNR\":\"5TOTOF\"}]}";}break;
            case 680297306:{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"1\",\"tierPointsCollected\":\"2000\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"Niklas.Koivu@rhyta.com\",\"firstName\":\"Niklas\",\"lastName\":\"Koivu\",\"memberNumber\":\"680297306\",\"mobilePhone\":\"+358444451378\",\"nextTier\":{\"flightsToNextTier\":\"24\",\"tierPointsToNextTier\":\"10000\"},\"status\":\"Active\",\"tierName\":\"Basic\"}},\"bookings\":[{\"PNR\":\"5TQSNC\"}]}";}break;
            case 680297314:{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"1\",\"tierPointsCollected\":\"2000\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"AddressTanjaSantti@scottv.fi\",\"firstName\":\"Tanja\",\"lastName\":\"Koivu\",\"memberNumber\":\"680297314\",\"mobilePhone\":\"+358441515130\",\"nextTier\":{\"flightsToNextTier\":\"24\",\"tierPointsToNextTier\":\"10000\"},\"status\":\"Active\",\"tierName\":\"Basic\"}},\"bookings\":[{\"PNR\":\"5TQSNC\"}]}";}break;
            default:{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"25\",\"tierPointsCollected\":\"56000\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"PhilipIThorsen@armyspy.com\",\"firstName\":\"Philip\",\"lastName\":\"Thorsen\",\"memberNumber\":\"680297272\",\"mobilePhone\":\"+4571191342\",\"nextTier\":{\"flightsToNextTier\":\"54\",\"tierPointsToNextTier\":\"90000\"},\"status\":\"Active\",\"tierName\":\"Platinum\"}},\"bookings\":[{\"PNR\":\"5TQTBZ\"}]}";}
            
        }
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        //String person1="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"25\",\"tierPointsCollected\":\"56000\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"PhilipIThorsen@armyspy.com\",\"firstName\":\"Philip\",\"lastName\":\"Thorsen\",\"memberNumber\":\"680297272\",\"mobilePhone\":\"+4571191342\",\"nextTier\":{\"flightsToNextTier\":\"54\",\"tierPointsToNextTier\":\"90000\"},\"status\":\"Active\",\"tierName\":\"Platinum\"}},\"bookings\":[{\"PNR\":\"5TQTBZ\"}]}";
        return profile;
    }
}
