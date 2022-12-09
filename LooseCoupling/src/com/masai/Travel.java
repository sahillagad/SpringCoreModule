package com.masai;

public class Travel {
          
	private vehical vehical;

	

	
	// SetterInjuction
	public void setVehical(vehical vehical) {
		this.vehical = vehical;
	}
	
	
	

	
	
	public  void getJourny() {
		
		
		System.out.println("I Start Journy...");
		vehical.go();
		
		
	}
	
}
