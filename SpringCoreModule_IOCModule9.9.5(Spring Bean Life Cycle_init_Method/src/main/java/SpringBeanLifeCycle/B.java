package SpringBeanLifeCycle;

public class B {

	int age;
	String name;
	
	
	public B() {
		System.out.println("------------Constructor----------------");
		System.out.println("I am inside the Constructor");	
	     System.err.println("AGE : "+age);
	     System.err.println("Name : "+name);
	     System.out.println("---------------------------------");
	    
	     
	}
	
	
	
	
	
	
	public void setAge(int age) {
	  System.out.println("Try TO Insert The Age");
		
		this.age = age;
	}
	public void setName(String name) {
		  System.out.println("Try TO Insert The Name");
		this.name = name;
	}
	
	
	
	public void mySetUp() {
		
		System.out.println("--------------mySetUp--------------");
		System.err.println("AGE : "+age);
		System.err.println("NAME : "+name);
		System.out.println("I am inside the My Set Up");
		System.out.println("Connection Craeted Logic");
        System.out.println("Initialization Logic");
		 
		
	}
	
	
	public void showB() {
		System.out.println("------------showB------------");
		System.out.println("AGE : "+age);
		System.err.println("NAME : "+name);
		
		
	}

	public void destroyMethod() {
		
		
		System.out.println("I am inside the Destroy Method");
		System.out.println("Connection is relaese");
		
		
	}
	

	
	 
}
