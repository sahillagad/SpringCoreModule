package com.masai;

public class Student {

	
	
    private int roll;
    private String name;
    private int marks;
    
    
    
    
    // Constructor Injuction point
    public Student(int roll,String name,int marks) {
    
    	this.roll=roll;
    	this.name=name;
    	this.marks=marks;
    	
    }
    
    
    public void showsStudent() {
    	System.out.println("Roll  : "+roll);
    	System.out.println("Name  : "+name);
    	System.out.println("Marks : "+marks);
    	System.out.println("--------------------");
    }

    
}
