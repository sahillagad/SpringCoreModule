package com.masai;

public class A {

	
	private int array[];

	public void setArray(int[] array) {
		this.array = array;
	}
	
	
	public void showA() {
		System.out.println("I am imside Show A");
		
		for(int i=0;i<array.length;i=i+1) {
			
			
			System.out.println(" array["+i+"]"+" = "+array[i]);
			 
			
		}
		
		
		
		
	}
	
	
	
}
