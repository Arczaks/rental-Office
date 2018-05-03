/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import com.mycompany.entities.Tour;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Archax
 */
public class TourContext implements Serializable {
    
    private final SortedMap<Integer, Tour> tours;
    
    public TourContext(){
        tours = Collections.synchronizedSortedMap(new TreeMap<Integer, Tour>());
        tours.put(1, new Tour(Long.valueOf(1), "Wieden", Double.valueOf(1500), "Wieden - Austria", Double.valueOf(1), Double.valueOf(1), "wycieczka do Wiednia"));
        tours.put(2, new Tour(Long.valueOf(2), "Jakims tam szlakiem", 1200.99, "Gdansk - Polska", Double.valueOf(1), Double.valueOf(1), "tak"));
    }
    
    public Tour getTour(Integer id){
        return tours.get(id);
    }
    
    public List<Tour> getAllTour(){
        return new ArrayList<>(tours.values());
    }
    
}
