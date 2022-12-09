package com.masai;

public class PersentationBean {

	
	private ServiceBean service;


	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	
	
	public void persent(int id) {

	    double interest=service.calculateInterest(id);
		
	    System.out.println("Interest Amount Is : "+interest);
	
	}
	
	
}
