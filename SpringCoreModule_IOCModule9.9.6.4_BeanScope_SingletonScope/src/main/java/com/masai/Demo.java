package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
 	     
   	 	A a=(A) ap.getBean("a");
   		A a1=(A) ap.getBean("a");
	 
   	   System.out.println("a Name : "+a.name);
   	 	
   	   System.out.println("Change Name of a class name Variable");
   	   
   	   a.name="Sahil";
   	   
   	   
   	   System.out.println("a1 Name : "+a1.name);
          	 	
	}
}
