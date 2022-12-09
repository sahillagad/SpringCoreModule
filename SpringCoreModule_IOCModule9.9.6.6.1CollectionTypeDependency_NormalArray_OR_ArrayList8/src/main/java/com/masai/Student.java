package com.masai;

public class Student {
	
 	private int roll;
 	private String name;
 	private int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	
	public int getRoll() {
		return roll;
	}




	public String getName() {
		return name;
	}




	public int getMarks() {
		return marks;
	}




	public void DisplayStudent() {
		System.out.println("["
				+ "\nroll=" + roll + ","
						+ "\nname=" + name + ", "
								+ "\nmarks=" + marks +
								"\n]");
	}
 	
 	
 	
 	

}
