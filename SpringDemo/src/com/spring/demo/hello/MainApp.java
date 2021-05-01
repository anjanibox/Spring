package com.spring.demo.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("helloBeans.xml");

      
      // Let us raise a start event.
      context.start();
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      
      
      obj.getMessage();
      
      // Let us raise a stop event.
      context.stop();
      
   }
}