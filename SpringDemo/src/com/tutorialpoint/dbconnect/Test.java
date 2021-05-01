package com.tutorialpoint.dbconnect;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconnectBeans.xml");  
    
    System.out.println("Connection established");
    
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    int status1=dao.saveEmployee(new Employee(102,"Amit",35000));  
    System.out.println(status1);  
          
  //  int status2 = dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
   // System.out.println(status2); 
      
          
   /* dao.setId(102); 
    int status3=dao.deleteEmployee(e); 
    System.out.println(status3);*/  
     
}  
  
}  