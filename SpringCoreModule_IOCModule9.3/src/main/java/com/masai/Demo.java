package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml"); 
	 	

	A aobj=(A)ap.getBean("a");
		
	System.out.println(aobj);
	aobj.showA();
	
	System.out.println("-----------------------------------");
	
	aobj.setX(10);
	aobj.showA();
		
	}
}