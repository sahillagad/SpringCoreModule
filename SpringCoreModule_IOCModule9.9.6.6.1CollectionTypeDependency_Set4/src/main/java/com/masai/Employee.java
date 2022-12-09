package com.masai;

import java.util.Objects;

public class Employee {

	private int eid;
	private String name;
	private double salary;
	
	
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public int hashCode() {
		return Objects.hash(eid, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


	public int getEid() {
		return eid;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}
 

	
	
	
}
