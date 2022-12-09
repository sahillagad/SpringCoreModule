package com.masai;

public class alphabet {

	private A a;
	private B b;
	private C c;
	public alphabet(A a, B b, C c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Inside 3 Argument Constructor");
	}
	public alphabet(A a, B b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Inside 2 Argument Constructor dependency is A,B Class");
	}
	
	
	public alphabet(A a, C c) {
		super();
		this.a = a;
		this.c = c;
		System.out.println("Inside 2 Argument Constructor dependency is A,C Class");
	}
	public alphabet() {
		super();
		System.out.println("Zero Argument Constructor...");
	}
	
	
       public void showAlphabet() {
    	   System.out.println("A Obj : "+a);
    	   System.out.println("B Obj : "+b);
    	   System.out.println("C Obj : "+c);
    	   
    	   
       }
	
	
}
