package com.masai;

public class A {

	private int n;
	private String name;
	private B b;
	
	
	public void setN(int n) {
		System.out.println("Try to Insert the n");
		this.n = n;
	}
	public void setName(String name) {
		System.out.println("Try to Insert the name");
		this.name = name;
	}
	public void setB(B b) {
		System.out.println("Try to Insert the B");
		this.b = b;
	}
	
	
	
	
	public A() {
		super();
		
		System.out.println("I am inside the Constructor");
	}
	public void initMethod() {
	 
		System.out.println("Connection Will Be Acquired");
			
	}
	

	public void showA() {
		System.out.println("I am inside the A Class");
		System.out.println("n value is "+n);
		System.out.println("name is "+name);
		System.out.println("B object : "+b);

	}
	
	
 
	
	
	
	
}
