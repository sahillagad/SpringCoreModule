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
 
		 
		System.out.println("------------------------");
	
		System.out.println("a name variable value "+a.name);
		System.out.println("a1 name variable value "+a1.name);
		 
		System.out.println("------------------------------");
		System.out.println("Change The Name of the a name variable value ");
		
		a.name="Tom";
		
		System.out.println("------------------------------");

		
		
		System.err.println("a name variable value "+a.name);
		System.err.println("a1 name variable value "+a1.name);
		
		
	}
}
