package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	A a =(A) ap.getBean("a");
	a.showA();	
	
	
	 B b=(B) ap.getBean("BOBJ");
	 b.showB();
		
	}
}
