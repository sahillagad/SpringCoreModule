package com.masai;

import java.time.LocalDate;

public class Student {

	private int roll;
	private String name;
	private String add;

	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}


	
	
	
	
	
}
