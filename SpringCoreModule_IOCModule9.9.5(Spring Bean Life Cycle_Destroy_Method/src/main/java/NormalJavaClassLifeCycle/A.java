package NormalJavaClassLifeCycle;

public class A {

	
	
	public A() {
		
		System.out.println("Object is craeted...");
	}
	
	
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("i am inside the finalize method");
        System.out.println("Object Will be destroy...");
	    System.out.println("Object dies");   
	}
	
	
	
	
	public void  ShowA() {
		
		System.out.println("I am inside the ShowA Of the A class " );  
	}
	
}
