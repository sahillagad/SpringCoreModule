package com.masai;

public class A {

	int age;
	String name;
	
	
	
	
	public void setAge(int age) {
		this.age = age;
	}



	public void setName(String name) {
		this.name = name;
	}



	public A() {
	
		System.out.println("I am Inside the A class Constructor");
		
	}
	
	
	
	public void showA() {
      
		System.out.println("AGE  : "+age);
		System.out.println("NAME : "+name);
	
	}
	
	
	

	
}

