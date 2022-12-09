package com.masai;

import java.util.Objects;

public class Employee {

	
	private int employeeId;
	private String name;
	private double salary;
	
	
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	
	public void EmployeeDetail() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Name        : "+name);
		System.out.println("Salary      : "+salary);
		System.out.println("---------------------------------");
	}


	@Override
	public int hashCode() {
		return Objects.hash(employeeId, name, salary);
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
		return employeeId == other.employeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	 
}
