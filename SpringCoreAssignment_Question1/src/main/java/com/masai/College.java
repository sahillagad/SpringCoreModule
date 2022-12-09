package com.masai;

public class College {

	private String college_Name;
	private Student student;
	private  String collage_address;
	public void setCollege_Name(String college_Name) {
		this.college_Name = college_Name;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setCollage_address(String collage_address) {
		this.collage_address = collage_address;
	}
	

	public void showDetail() {
		System.out.println("College Name    : "+college_Name);
		System.out.println("College Address : "+collage_address);
		System.out.println("College student : "+student);	
	}
     	 
	
}
