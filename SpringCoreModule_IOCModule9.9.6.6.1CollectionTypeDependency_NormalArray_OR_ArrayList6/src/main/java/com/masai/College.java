package com.masai;

import java.util.List;

public class College {

	
	// simple type dependency
	private String Collegename;
	
	
	// collection type (list Student)
	private List<Student> students;


	// Constructor injuction point
	public College(String collegeName) {
		this.Collegename = collegeName;
	}
	

	// Setter injuction point
	public void setStudents(List<Student> students) {
		this.students = students;
	}



	
	// getter Method
	public String getCollegeName() {
		return Collegename;
	}

	public List<Student> getStudents() {
		return students;
	}



	 public void displayCollege() {
		 
		 System.out.println("Name Of college : "+Collegename); 
		 
		 for(Student stud:students) {
		
			  stud.DisplayStudent(); 
			 
		 }
		 

		 
		 
	 }
	 
	
	
	
	
	
	
}
