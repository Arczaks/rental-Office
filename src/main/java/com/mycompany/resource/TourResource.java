/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.resource;

import com.mycompany.entities.Tour;
import com.mycompany.servlet.TourContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Archax
 */
@Path("/tours")
public class TourResource {
    
    @Context
    ServletContext context;

    @Context
    HttpServletRequest request;

    @Context
    HttpServletResponse response;
    
        
     private TourContext getTourContext() {
        TourContext tourContext = (TourContext) context.getAttribute("tourContext");
        if (tourContext == null) {
            tourContext = new TourContext();
            context.setAttribute("tourContext", tourContext);
        }
        return tourContext;
    }
    
    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tour> listBooks() {
        return getTourContext().getAllTour();
    }
    
}
