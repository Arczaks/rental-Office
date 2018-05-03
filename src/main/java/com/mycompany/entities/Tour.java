/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Archax
 */
@XmlType(name = "tour")
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "tour")
@Getter
@Setter
@ToString
public class Tour implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "id")
    private Long id;
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlAttribute(name = "description")
    private String description;
    
    @XmlAttribute(name = "price")
    private Double price;
    
    @XmlAttribute(name = "location")
    private String location;
    
    @XmlAttribute(name = "locationLng")
    private Double locationLng;
    
    @XmlAttribute(name = "locationLat")
    private Double locationLat;
   
    public Tour(){}
    
    public Tour(Long id,
            String name, 
            Double price, 
            String location, Double locationLng, Double locationLat, 
            String description){
            this.id = id;
            this.name = name;
            this.price = price;
            this.location = location; 
            this.locationLng = locationLng;
            this.locationLat = locationLat;
            this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tour)) {
            return false;
        }
        Tour other = (Tour) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
}
