/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author vijay
 */
@Entity
@Named
public class Project  {
    @Id
    private int Id;
    private String Name;
    private List<supplier> suppliers;
    private List<Customer> customers;
    
    
}
