package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Travel tr1=ac.getBean("tr",Travel.class);	
	     tr1.Journy();
	       
	    
	    System.out.println("=================================================");
	    
	    
	    
	    
	    Travel tr2=ac.getBean("tr1",Travel.class);	
		tr2.Journy();
		
		
		
		
		
		
		
		
	}
	
	
	
}
