package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
public static void main(String[] args) {
	
	
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	MyBusiness business=ap.getBean("mybusiness",MyBusiness.class);
	
	business.fun1();
	
	
	
	
	
	
}
}
