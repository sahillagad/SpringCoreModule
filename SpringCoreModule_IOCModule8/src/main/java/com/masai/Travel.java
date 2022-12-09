package com.masai;

public class Travel {

	private Vechical v1;
	private int numberOfPerson;
	
	// constructor injuction
	public Travel(Vechical v1, int numberOfPerson) {
				this.v1 = v1;
		this.numberOfPerson = numberOfPerson;
	}
	
	
	
	
	public Travel() {
		super();
	}




	public void journy() {
		
		System.out.println("Journy Started....");
		System.out.println("I Journy "+numberOfPerson+" Person"); 
	     System.out.println("Vechical Object "+v1);
		
		
		
		
	}
	
}
