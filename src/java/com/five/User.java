/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.five;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.Random;
import javax.ws.rs.MatrixParam;

/**
 * REST Web Service
 *
 * @author root
 */
@Path("user")
public class User extends config{

    @Context
    private UriInfo context;
    
    /**
     * Creates a new instance of GenericResource
     */
    public User() {
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
        return profile;
    }
    
    
    @GET
    @Path("getBookingDetails/{pnr}")
    @Produces("application/json")
    public String getBookingDetails(@PathParam("pnr")String pnr) {
        System.out.println(pnr);
        String profile="";
        switch(pnr){
            case "5TQTBZ":{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"0\",\"tierPointsCollected\":\"0\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"Nami.Aoki@e2xample.com\",\"firstName\":\"Nami\",\"lastName\":\"Aoki\",\"memberNumber\":\"680297298\",\"mobilePhone\":\"81413669538\",\"nextTier\":{\"flightsToNextTier\":\"24\",\"tierPointsToNextTier\":\"40000\"},\"status\":\"Active\",\"tierName\":\"Basic\"}},\"bookings\":[{\"PNR\":\"5TOTOF\"}]}";}break;
            case "5TOTOF":{profile="{\"email\":\"LEENA.VIHERVAARA-RUSKI@FINNAIR.COM\",\"journeys\":[{\"flights\":[{\"arrival\":{\"airport\":\"HEL\",\"airportName\":\"Helsinki Vantaa\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T15:20:00+02:00\",\"municipality\":\"Helsinki\",\"scheduledDateTime\":\"2015-11-14T15:20:00+02:00\",\"terminal\":\"2\"},\"boarding\":{\"gateStatus\":\"WAITING_FOR_OPENING\"},\"bookingClass\":\"B\",\"checkin\":{\"checkinCloseDateTime\":\"2015-11-14T11:00:00+09:00\",\"checkinOpenDateTime\":\"2015-11-13T00:00:00+09:00\",\"checkinOptions\":[\"KIOSK\",\"MOBILE\",\"SMS\",\"TELEPHONE\",\"AIRLINE_AGENT\",\"GROUND_HANDLING_AGENT\",\"WEB\"],\"checkinUrl\":\"https://pdt.checkin.amadeus.net/1ASIHSSCMCIAY/sscxay/checkindirect?ln=en&type=A&Redirected=true&TraceMode=N&ISurname=AOKI&IIdentificationBookingRef=5TOTOF\",\"externalCheckin\":false},\"departure\":{\"airport\":\"NRT\",\"airportName\":\"Narita Intl\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T12:00:00+09:00\",\"municipality\":\"Tokyo\",\"scheduledDateTime\":\"2015-11-14T12:00:00+09:00\",\"terminal\":\"2\"},\"duration\":\"10:20\",\"equipment\":\"333\",\"flightNumber\":\"074\",\"marketingAirline\":\"AY\",\"status\":\"SCHEDULED\",\"travelClass\":\"ECONOMY\",\"uniqueId\":\"0742015-11-14NRTHEL\"},{\"arrival\":{\"airport\":\"CDG\",\"airportName\":\"Charles De Gaulle\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T18:10:00+01:00\",\"municipality\":\"Paris\",\"scheduledDateTime\":\"2015-11-14T18:10:00+01:00\",\"terminal\":\"2D\"},\"boarding\":{\"gateStatus\":\"WAITING_FOR_OPENING\"},\"bookingClass\":\"B\",\"checkin\":{\"checkinCloseDateTime\":\"2015-11-14T15:20:00+02:00\",\"checkinOpenDateTime\":\"2015-11-13T04:05:00+02:00\",\"checkinOptions\":[\"KIOSK\",\"MOBILE\",\"SMS\",\"TELEPHONE\",\"AIRLINE_AGENT\",\"GROUND_HANDLING_AGENT\",\"WEB\"],\"checkinUrl\":\"https://pdt.checkin.amadeus.net/1ASIHSSCMCIAY/sscxay/checkindirect?ln=en&type=A&Redirected=true&TraceMode=N&ISurname=AOKI&IIdentificationBookingRef=5TOTOF\",\"externalCheckin\":false},\"departure\":{\"airport\":\"HEL\",\"airportName\":\"Helsinki Vantaa\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T16:05:00+02:00\",\"municipality\":\"Helsinki\",\"scheduledDateTime\":\"2015-11-14T16:05:00+02:00\",\"terminal\":\"2\"},\"duration\":\"03:05\",\"equipment\":\"32B\",\"flightNumber\":\"873\",\"marketingAirline\":\"AY\",\"status\":\"SCHEDULED\",\"travelClass\":\"ECONOMY\",\"uniqueId\":\"8732015-11-14HELCDG\"}],\"journeyId\":\"2015-11-14_074_873\"}],\"passengers\":[{\"firstName\":\"SHIZUE MR\",\"lastName\":\"AOKI\",\"passengerFlightInfos\":[{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"0742015-11-14NRTHEL\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}},{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"8732015-11-14HELCDG\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}}],\"passengerNum\":\"2\",\"type\":\"ADT\"},{\"firstName\":\"NAMI MS\",\"lastName\":\"AOKI\",\"passengerFlightInfos\":[{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"0742015-11-14NRTHEL\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}},{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"8732015-11-14HELCDG\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}}],\"passengerNum\":\"3\",\"type\":\"ADT\"}],\"phoneNumber\":\"81413669538\",\"recLoc\":\"5TOTOF\"}";}break;
            
            case "5TQSNC":{profile="{\"email\":\"LEENA.VIHERVAARA-RUSKI@FINNAIR.COM\",\"journeys\":[{\"flights\":[{\"arrival\":{\"airport\":\"HEL\",\"airportName\":\"Helsinki Vantaa\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T15:20:00+02:00\",\"municipality\":\"Helsinki\",\"scheduledDateTime\":\"2015-11-14T15:20:00+02:00\",\"terminal\":\"2\"},\"boarding\":{\"gateStatus\":\"WAITING_FOR_OPENING\"},\"bookingClass\":\"B\",\"checkin\":{\"checkinCloseDateTime\":\"2015-11-14T11:00:00+09:00\",\"checkinOpenDateTime\":\"2015-11-13T00:00:00+09:00\",\"checkinOptions\":[\"KIOSK\",\"MOBILE\",\"SMS\",\"TELEPHONE\",\"AIRLINE_AGENT\",\"GROUND_HANDLING_AGENT\",\"WEB\"],\"checkinUrl\":\"https://pdt.checkin.amadeus.net/1ASIHSSCMCIAY/sscxay/checkindirect?ln=en&type=A&Redirected=true&TraceMode=N&ISurname=AOKI&IIdentificationBookingRef=5TOTOF\",\"externalCheckin\":false},\"departure\":{\"airport\":\"NRT\",\"airportName\":\"Narita Intl\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T12:00:00+09:00\",\"municipality\":\"Tokyo\",\"scheduledDateTime\":\"2015-11-14T12:00:00+09:00\",\"terminal\":\"2\"},\"duration\":\"10:20\",\"equipment\":\"333\",\"flightNumber\":\"074\",\"marketingAirline\":\"AY\",\"status\":\"SCHEDULED\",\"travelClass\":\"ECONOMY\",\"uniqueId\":\"0742015-11-14NRTHEL\"},{\"arrival\":{\"airport\":\"CDG\",\"airportName\":\"Charles De Gaulle\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T18:10:00+01:00\",\"municipality\":\"Paris\",\"scheduledDateTime\":\"2015-11-14T18:10:00+01:00\",\"terminal\":\"2D\"},\"boarding\":{\"gateStatus\":\"WAITING_FOR_OPENING\"},\"bookingClass\":\"B\",\"checkin\":{\"checkinCloseDateTime\":\"2015-11-14T15:20:00+02:00\",\"checkinOpenDateTime\":\"2015-11-13T04:05:00+02:00\",\"checkinOptions\":[\"KIOSK\",\"MOBILE\",\"SMS\",\"TELEPHONE\",\"AIRLINE_AGENT\",\"GROUND_HANDLING_AGENT\",\"WEB\"],\"checkinUrl\":\"https://pdt.checkin.amadeus.net/1ASIHSSCMCIAY/sscxay/checkindirect?ln=en&type=A&Redirected=true&TraceMode=N&ISurname=AOKI&IIdentificationBookingRef=5TOTOF\",\"externalCheckin\":false},\"departure\":{\"airport\":\"HEL\",\"airportName\":\"Helsinki Vantaa\",\"date\":\"2015-11-14\",\"estimatedDateTime\":\"2015-11-14T16:05:00+02:00\",\"municipality\":\"Helsinki\",\"scheduledDateTime\":\"2015-11-14T16:05:00+02:00\",\"terminal\":\"2\"},\"duration\":\"03:05\",\"equipment\":\"32B\",\"flightNumber\":\"873\",\"marketingAirline\":\"AY\",\"status\":\"SCHEDULED\",\"travelClass\":\"ECONOMY\",\"uniqueId\":\"8732015-11-14HELCDG\"}],\"journeyId\":\"2015-11-14_074_873\"}],\"passengers\":[{\"firstName\":\"SHIZUE MR\",\"lastName\":\"AOKI\",\"passengerFlightInfos\":[{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"0742015-11-14NRTHEL\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}},{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"8732015-11-14HELCDG\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}}],\"passengerNum\":\"2\",\"type\":\"ADT\"},{\"firstName\":\"NAMI MS\",\"lastName\":\"AOKI\",\"passengerFlightInfos\":[{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"0742015-11-14NRTHEL\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}},{\"checkinStatus\":\"UNKNOWN\",\"flightUniqueId\":\"8732015-11-14HELCDG\",\"seat\":{\"col\":\"\",\"row\":\"\",\"type\":\"\"}}],\"passengerNum\":\"3\",\"type\":\"ADT\"}],\"phoneNumber\":\"81413669538\",\"recLoc\":\"5TOTOF\"}";}break;
        
            default:{profile="{\"profile\":{\"basicInformation\":{\"awardPoints\":20000,\"cardReminder\":true,\"currentPeriod\":{\"qualifyingFlightsFlown\":\"25\",\"tierPointsCollected\":\"56000\",\"trackingPeriodEnd\":\"2016-09-30\",\"trackingPeriodStart\":\"2015-09-24\"},\"email\":\"PhilipIThorsen@armyspy.com\",\"firstName\":\"Philip\",\"lastName\":\"Thorsen\",\"memberNumber\":\"680297272\",\"mobilePhone\":\"+4571191342\",\"nextTier\":{\"flightsToNextTier\":\"54\",\"tierPointsToNextTier\":\"90000\"},\"status\":\"Active\",\"tierName\":\"Platinum\"}},\"bookings\":[{\"PNR\":\"5TQTBZ\"}]}";}
            
        }
        return profile;
    }
    @GET
    @Path("hiker")
    @Produces("application/json")
    public String hiker() {
        config db=new config();
        return "Just connecting";
    }
    
    @GET
    @Path("gethiker")
    @Produces("application/json")
    public String hitchhiker(@MatrixParam("start")String start,@MatrixParam("user")int user) throws SQLException {
        
        config db=new config();
        Random rand = null;
        String hikernames[]={"charizard","onix","steelix","raichu","charmander","psyduck"};
        String locations[]={"HEL","ARN","PAR","BUD","LON","EIN"};
        int randomhiker = 0 + (int)(Math.random() * ((hikernames.length-1 -0) + 1));
        int randomloc = 0 + (int)(Math.random() * ((locations.length-1 -0) + 1));
        System.out.println("asas"+start+user);
        return db.getdbHiker(start, locations[randomloc], hikernames[randomhiker],user);
    }
    
    @GET
    @Path("drophiker")
    @Produces("application/json")
    public String drophiker(@MatrixParam("current")String current,@MatrixParam("hiker_id")int hiker_id) throws SQLException {
        
        config db=new config();
        System.out.println("asas"+current+hiker_id);
        return db.dropHiker(current, hiker_id);
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
        
        //URL url = new URL("https://slush.ecom.finnair.com/api/oauth2.0/authorize?appId="+appid+"&user="+user+"&accessToken="+accessToken+"&redirect_url=jsd");
        URL url=new URL("http://slush.ecom.finnair.com/api/oauth2.0/authorize?appId=5152&user=Five.5&accessToken=2323323&redirect_url=jsd");
        //URL url=new URL("https://www.facebook.com/");
        System.out.println(url);
        String result=tryThis(url);
        return result;
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
    
}
