package com.masai;
public class Car implements vehicle {

	
	public void start() {
		System.out.println("Car is start...");
		
	}
	
	
	@Override 
	public void go() {
		start();
		
		
		
	}
	
}
