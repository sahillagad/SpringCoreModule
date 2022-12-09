package com.masai;

public class Student {

	
	private int roll;
	private String name;
	private int marks;
	private String location;
	
	
	public Student() {
		
		System.out.println("I am inside the Student Constructor");
		
		System.out.println("inside Constructor Roll : "+roll);
		System.out.println("inside Constructor Name : "+name);
		System.out.println("inside Constructor Marks : "+marks);
		System.out.println("inside ConstructorLocation : "+location);
		
		System.out.println("----------------****------------------");
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
		
		
		System.out.println("inside initMethod Roll : "+roll);
		System.out.println("inside initMethod Name : "+name);
		System.out.println("inside initMethod Marks : "+marks);
		System.out.println("inside initMethod Location : "+location);
		
		
		
	}
     
	
	
	
	public void showStudend() {
		
		
		System.out.println("inside showStudend Roll : "+roll);
		System.out.println("inside showStudend Name : "+name);
		System.out.println("inside showStudend Marks : "+marks);
		System.out.println("inside showStudend Location : "+location);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
