package com.masai;

import java.util.List;

public class A {

	
	private List<Student> students;

	private String collegeName;  
	
	
	public void setStudents(List<Student> students) {
		this.students = students;
		
	}
	
	
	
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}




	public void showA() {
		System.out.println("I am inside A Class");
		System.out.println("College name "+collegeName);
		System.err.println("------ALL STUDENT DETAILS-------");
		
		for(Student st:students) {
			
			
			st.showsStudent();
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
