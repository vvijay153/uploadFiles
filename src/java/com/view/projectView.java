/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.business.SupplierEjb;
import com.entities.Customer;
import com.business.CustomerEjb;
import com.entities.supplier;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;

import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import javax.servlet.http.Part;
/**
 *
 * @author vijay
 */

@RequestScoped
@Named

public class projectView  {
    
    @EJB
    private SupplierEjb supplierEjb;
   
    @EJB
    private CustomerEjb customerEjb;
    
    private supplier supplier;
  private Customer customer;
  private String name;
  private Part file;

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
  private UploadedFile File;
  private String Location;
  private String Demand;
 
    public supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(supplier supplier) {
        this.supplier = supplier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
   

    @PostConstruct
    public void init() {
    
    if(supplier==null)
    {
         supplier= new supplier();
    }
    if(customer==null)
    {
        customer= new Customer();
    }
     
    }
    
//    public String check()
//    {
//        System.out.println(selectedOption);
//     if("supplier" .equals(selectedOption))
//             {
//             System.out.println("supplier");
//                     return "supplier";
//                     }
//     else if("customer".equals(selectedOption))
//             {
//              System.out.println("customer");
//              
//             return "customer";
//             }
//     else return null;
//    } 
    
   
       
    public void onAddSupplier()
    {
        
       supplierEjb.addsupplier(supplier) ;
       
           }
    
     public void onAddCustomer()
    {
        customerEjb.addcustomer(customer) ;
      
       
           }
    public void upload(FileUploadEvent event)
    {
      File = event.getFile();
        System.out.println("abcdrfel");
        System.out.println(File.getFileName()); 
        
    }
    
    public void addFile() throws IOException
    {
         System.out.print(">>> in uploadStudents");
        String record = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()));
        try {
            while ((record = br.readLine()) != null) {
                String recordValues[] = record.split(",");    
                System.out.println(recordValues[1]);
               supplier s= new supplier();
                s.setName(recordValues[0]);
                s.setLocation(recordValues[2]);
                s.setDemand(recordValues[1]);
                System.out.println(s.getName());
                supplierEjb.addsupplier(s);
               
                
                
                

      } 
        
       
    
    }
       catch (Exception e) {
                
        }

      
        
    }
}
