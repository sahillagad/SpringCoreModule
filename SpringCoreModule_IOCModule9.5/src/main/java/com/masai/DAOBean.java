package com.masai;

import javax.persistence.EntityManager;

public class DAOBean {
	 
	
	public Account findAccountById(int AccountId) { 
		 Account account=null;
		
		EntityManager em=EMUtility.provideEntityManager();
		
	     account=em.find(Account.class, AccountId);
		


	     
		return account;
	}
	
	
	
	
	
	
	
}