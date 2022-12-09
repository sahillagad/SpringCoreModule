package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml"); 
	 	
		
		A a= ap.getBean("aobj",A.class);
		System.out.println(a);
	    a.showA();  	
		
		System.out.println("---------------------------------------");
		
		
		B b=ap.getBean("bobj",B.class);
		System.out.println(b);
        b.showB();  
		
		
		
		
	}
}
