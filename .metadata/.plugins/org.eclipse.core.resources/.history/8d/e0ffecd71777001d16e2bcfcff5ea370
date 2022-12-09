package com.masai;

import java.util.Objects;

public class Student {

	private int rollNo;
	private String name;
	private int marks;
	
	
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	public int getRollNo() {
		return rollNo;
	}



	public String getName() {
		return name;
	}



	public int getMarks() {
		return marks;
	}



	public void showA() {
		
		System.out.println("I am inside the showA method in the Student Class");
		
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name    : "+name);
		System.out.println("Marks   : "+marks);
	    System.out.println("-------------------------"); 
	
	}



	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollNo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
	
	
}
