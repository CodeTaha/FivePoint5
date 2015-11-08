/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.five;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author root
 */
@Path("MyPath")
public class MyPathResource {

    @Context
    private UriInfo context;
   
    /**
     * Creates a new instance of MyPathResource
     */
    public MyPathResource() {
    
    }

    /**
     * Retrieves representation of an instance of com.test.MyPathResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "My first test servic1e";
    }
    @GET
    @Path("MyPath2")
    @Produces("text/plain")
    public String getText2() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "My first test 2";
    }
    /**
     * PUT method for updating or creating an instance of MyPathResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("text/plain")
    public void putText(String content) {
        System.out.println("CONTESST="+content);
    }
}
