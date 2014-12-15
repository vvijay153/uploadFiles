/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author vijay
 */
@Entity
@Named
public class Customer {
   @Id
   private int Id;
    private String Name;
    private String Location;
    private String Demand;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDemand() {
        return Demand;
    }

    public void setDemand(String Demand) {
        this.Demand = Demand;
    }
    
}
