package com.masai;

public class Bike implements vehical{

	public void Start() {
		
		System.out.println("Bike Is Started....");
	}
	
	
	@Override
	public void go() {
		
		Start();
				
	}

}
