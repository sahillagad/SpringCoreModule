package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A a =(A)ap.getBean("aObj");
		A a1 =(A)ap.getBean("aObj");
		
		
		System.out.println("a object Address : "+a );
		System.out.println("a1 object Address : "+a1 );
 
		
		System.out.println(a==a1);
		
	}
}
