package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	
		
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Travel travel= context.getBean("travel",Travel.class);
	
	
	travel.journy();
	
	
}
}
