package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	Student stu1=context.getBean("s1", Student.class);
	Student stu2=context.getBean("s2", Student.class);
	Student stu3=context.getBean("s3", Student.class);
		
		
	System.out.println(stu1);
	System.out.println(stu2);
    System.out.println(stu3);
	
	}
}
