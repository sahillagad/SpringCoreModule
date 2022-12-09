package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	
	
	
	
	
	
	
	
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
    A aObj=ap.getBean("a",A.class);
    System.out.println(aObj); 
    
    
    System.out.println("-----------------------------------------");
    
    B bObj=ap.getBean("b",B.class);
	System.out.println(bObj);
	
	
	
	
	
	
}
}
