package com.masai;

import java.util.List;

public class A {

	
	//Collection Dependency
	private List<String> names;

	

	
	//Setter Injection
	public void setNames(List<String> names) {
		this.names = names;
	}





	public void showA() {
		System.out.println("inside showA of A");
		System.out.println(names);
		
		
		
	}
	
	
	
}
