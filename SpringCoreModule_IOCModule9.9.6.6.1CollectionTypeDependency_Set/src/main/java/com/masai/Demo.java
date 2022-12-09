package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	   Department department=(Department)ap.getBean("D");
		System.out.println("Department Name"+department.getDepName());
	   
		for(Employee empl:department.getEmployees()) {
			
			
			empl.EmployeeDetail();
			
			
		}
	   
		
		
	}
}
