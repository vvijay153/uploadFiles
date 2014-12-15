/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entities.Customer;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vijay
 */
@Stateful
public class CustomerEjb {
    

     @PersistenceContext
    EntityManager em;
    
    public void addcustomer(Customer customer) {
         
        System.out.println("Customer name" + customer.getName());
        
        em.merge(customer);
    }
    
    
    
}
