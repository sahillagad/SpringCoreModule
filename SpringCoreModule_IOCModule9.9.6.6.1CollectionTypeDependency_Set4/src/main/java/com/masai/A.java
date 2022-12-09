package com.masai;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {

 private Map<Employee,String> employeeDetails;

public void setEmployeeDetails(Map<Employee, String> employeeDetails) {
	this.employeeDetails = employeeDetails;
}
 
 
   public void showEmployeeDetail() {
	   
	   Set<Entry<Employee, String>> map= employeeDetails.entrySet(); 	   
	   
	   for(Entry<Employee,String> entry:map) {
		   
		   System.out.println("Employee id     : "+entry.getKey().getEid());
		   System.out.println("Employee name   : "+entry.getKey().getName());
		   System.out.println("Employee salary : "+entry.getKey().getSalary());
		   System.out.println("Department      : "+entry.getValue());
		   System.out.println("-----------------------------------------------");
		   
	   }
	   
	   
   }
  
}
