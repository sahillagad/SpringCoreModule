package com.masai;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A {

	// collection dependency
	private Map<String,String> stateAndCaptial;

	public void setStateAndCaptial(Map<String, String> stateAndCaptial) {
		this.stateAndCaptial = stateAndCaptial;
	}
	
	
	 
	public void showA() {
	System.out.println("in side the showA method of a A class");
	
	
 Set<Entry<String,String>>	set= stateAndCaptial.entrySet();
	
 for(Entry<String,String> entry:set) {
	 
	 System.out.println(entry.getKey()+" "+entry.getValue());
	
	  
 }
 
	}
}
