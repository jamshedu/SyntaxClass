package com.syntaxclass19;

public class StudentClass {
	

	
	String name, address;
	
	StudentClass(String name, String address){
		
		this.name=name;
		
		this.address=address;
	}
	void displayInfo(){
		System.out.println("Student "+name+" live  "+address);
	}
	public static void main(String[] args) {
		StudentClass student=new StudentClass("John","722 s Bixel st Los Angles");
		student.displayInfo();
		student=new StudentClass("John","722 s Bixel st Los Angles");
		student.displayInfo();

	}
}
