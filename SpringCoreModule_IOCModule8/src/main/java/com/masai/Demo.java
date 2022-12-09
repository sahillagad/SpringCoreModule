package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Travel travel= ap.getBean("tr1",Travel.class);
		
		travel.journy();
		
	}
}
