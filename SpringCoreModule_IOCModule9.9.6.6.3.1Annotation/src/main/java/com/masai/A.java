package com.masai;

import java.util.Properties;

public class A {

	private Properties Theproperties;

	public void setTheproperties(Properties theproperties) {
		Theproperties = theproperties;
	}

	public void showA() {
		System.out.println("I am inside the showA method of the A Class");
	    
		System.out.println(Theproperties); 
	 	
	}
	
	
}

