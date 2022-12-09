package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	 
		A a1=(A) ap.getBean("a");
		A a2=(A) ap.getBean("a");
		
		
		System.out.println("a1 Object Address"+a1);
		System.out.println("a2 Object Address"+a2);
		 
		System.out.println("Both Object Is Same : "+(a1==a2));
		
	}
}
