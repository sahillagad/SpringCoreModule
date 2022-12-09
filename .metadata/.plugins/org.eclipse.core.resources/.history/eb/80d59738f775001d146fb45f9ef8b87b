package App.DataAccessLayer;

import javax.persistence.EntityManager;
import App.Utility.EMUtility;

import App.Entity.Account ;
public class DAOBean {
	 
	
	public static Account findAccountById(int AccountId) { 
		 Account account=null;
		
		EntityManager em=EMUtility.provideEntityManager();
		
	     account=em.find(Account.class, AccountId);
		


	     
		return account;
	}
	
	
	
	
	
	
	
}
