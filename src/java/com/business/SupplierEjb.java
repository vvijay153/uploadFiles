/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;


import com.entities.supplier;
import java.io.FileInputStream;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author vijay
 */
@Stateful
public class SupplierEjb {

     @PersistenceContext
    EntityManager em;
    public void addsupplier(supplier supplier) {
         
        System.out.println("supplier name" + supplier.getName());
       
        em.merge(supplier);
    }
    
    
    
    
//    public void excelData()
//    {
//        FileInputStream input = new FileInputStream("D:\\employeedata.xls");  
//                  
//                HSSFWorkbook wb = new HSSFWorkbook(fs);  
//                HSSFSheet sheet = wb.getSheetAt(0);  
//                HSSFRow row;  
//
//
//                for(int i=1; i<=sheet.getLastRowNum(); i++)
//                {  
//                    Employee employee=new Employee();
//                    row = sheet.getRow(i);  
//
//
//                    employee.setEmployeeName(String.valueOf(row.getCell(0).getRichStringCellValue()));  
//                    employee.setDesignation(String.valueOf(row.getCell(1).getRichStringCellValue()));
//                    employee.setSalary((long)row.getCell(2).getNumericCellValue());
//
//                    employeeService.insert(employee); // call to spring service layer
//
//                }  
//    } catch (FileNotFoundException ec) {
//        ec.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//    
//    }
    
    
}
