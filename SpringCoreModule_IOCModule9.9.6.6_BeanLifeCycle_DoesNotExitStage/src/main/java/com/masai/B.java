package com.masai;

public class B {
	int age;
	String name;
	
	
	
	
	public void setAge(int age) {
		this.age = age;
	}



	public void setName(String name) {
		this.name = name;
	}



	public B() {
	
		System.out.println("I am Inside the B class Constructor");
		
	}
	
	
	
	public void showB() {
      
		System.out.println("AGE  : "+age);
		System.out.println("NAME : "+name);
	
	}
	
}
