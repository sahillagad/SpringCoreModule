package com.masai;

public class A {

	
	private String[] cities;

	public void setCities(String[] cities) {
		this.cities = cities;
	}
	
	
	public void showA() {
	 for(int i=0;i<cities.length;i=i+1) {
		 System.out.println("cities["+i+"]"+" = "+cities[i]);
	 }
	}
}
