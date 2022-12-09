package com.masai;

public class ServiceBean {
	
	
	private DAOBean dao;


     
	
	public ServiceBean(DAOBean dao) {
		super();
		this.dao = dao;
	}




	public double calculateInterest(int AccontId) {
		
	Double interest=null; 	
     Account account=dao.findAccountById(AccontId);
	 
     interest=((account.getBalance()*5)/100);
     
     
     
		
		return interest;
		
	}
	

}
