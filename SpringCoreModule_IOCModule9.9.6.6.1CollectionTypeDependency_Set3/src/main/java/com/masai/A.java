package com.masai;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {


	private Map<Integer,Student> map;

	public void setMap(Map<Integer, Student> map) {
		this.map = map;
	}
	
	
	
	public void showA() {
		System.out.println("I am Inside the showA of A class");
		
		
		Set<Entry<Integer, Student>>  entries= map.entrySet();
		
		for(Entry<Integer, Student> entry:entries) {
		
			System.out.println("Roll Number : "+entry.getKey());
			System.out.println("Name        : "+entry.getValue().getName());
			System.out.println("Marks       : "+entry.getValue().getMarks() );
			
			System.out.println("------------------------------------------");
			
		}
		
		
	}

}
