/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.messages.rest;

import com.example.messages.services.MessageService;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
//import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author cgarate
 */
@Path("messages")
@Stateless //Se pide que sean stateless
@ApplicationScoped
public class RestServer {

    //@Inject
    //private MessageService messageService;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestServer
     */
    public RestServer() {
    }

    /**
     * Retrieves representation of an instance of com.example.messages.rest.RestServer
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)//Porque se pide que se trabaje con json para los formularios
    public List<String>  getJson() {
        //Aquí sólo estoy tratando de ver cómo funciona json en el server
        List<String> jsonList = new ArrayList<String>();
        jsonList.add("Hello World!");
        jsonList.add("Bonjour monde");
         
        return jsonList;          
        //TODO return proper representation object
        //return "Hello World!";
        //throw new UnsupportedOperationException();
        //return Arrays.toString(messageService.getAll().toArray());
        //return Arrays.toJSON(messageService.getAll().toArray());
        //return new JsonResult {Data: "Hello world!"};
    }
    
    /**@GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hello, World!!</body></h1></html>";
    }**/

    /**
     * PUT method for updating or creating an instance of RestServer
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    //@POST
    //public String postHtml(String message) {
    //return messageService.add(message);
    //}
}
