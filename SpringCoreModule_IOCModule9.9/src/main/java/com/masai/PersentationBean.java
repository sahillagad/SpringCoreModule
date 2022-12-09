package com.masai;

public class PersentationBean {

	
	private ServiceBean service;
    private A a;

    
    
    
	
	
	





	public PersentationBean(ServiceBean service, A a) {
		super();
		this.service = service;
		this.a = a;
	}












	public void persent(int id) {

		 System.out.println("A Obj : "+a);
	    double interest=service.calculateInterest(id);
		
	    System.out.println("Interest Amount Is : "+interest);
	
	}
	
	
}
