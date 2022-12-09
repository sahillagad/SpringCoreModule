package SpringBeanLifeCycle;

public class B {

	int age;
	String name;
	
	
	public B() {
	
		System.out.println("I am inside the Constructor");	
	
	     
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
		
		System.out.println("I am inside the My Set Up");
		System.out.println("Connection Craeted Logic");
        System.out.println("Initialization Logic");
		 
		
	}
	
	
	public void showB() {
		System.out.println("I am inside the Show Method");
		System.out.println("AGE : "+age);
		System.err.println("NAME : "+name);
		
		
	}
	
	public void destroyMethod() {
		
		System.out.println("Inside Destroy Method");
		System.out.println("Connection will be Release..."); 
		
	}
}
