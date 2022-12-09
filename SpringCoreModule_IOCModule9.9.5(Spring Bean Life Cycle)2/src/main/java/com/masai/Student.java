package com.masai;

public class Student {

	
	private int roll;
	private String name;
	private int marks;
	private String location;
	
	
	public Student() {
		
		System.out.println("I am inside the Student Constructor");
		
	}
	
	
	
	public void setRoll(int roll) {
		System.out.println("Insert Roll Number");
		this.roll = roll;
	}
	public void setName(String name) {
		System.out.println("Insert Name");
		this.name = name;
	}
	public void setMarks(int marks) {
		System.out.println("Insert Marks");
		this.marks = marks;
	}
	public void setLocation(String location) {
		System.out.println("Insert Location");
		this.location = location;
	}
	
	
	public void initMethod() {
		
		System.out.println("I am inside the Studend Class");
		System.out.println("Connection is aquired");
		
		
		
	}
     
	
	
	
	public void showStudend() {
		
		
		System.out.println("Roll : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
		System.out.println("Location : "+location);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
