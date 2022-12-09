package NormalJavaClass;

public class A{

	public A() {
		
	System.out.println("I am Inside the Constructor");	
	System.out.println("Object Is Created");
		
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		
		
		System.out.println("Object Dies...");
		System.out.println("inside the Finalized Method");
		
		
		
	}
	
	
	 
	
}
