package com.syntaxclass15;

public class CreatMethod {
	
	
	// we want create a method that will accept marks (90, 80)
	// base on the mark it will return grade (A, B, C)
	// if grade >90--->A, if 90<grade >80--->B, if 80<grade >70--->C,
	
	char getGrade(int a) {
		char grade;
	
	
	if (a>90) {
		grade='A';
		
	}else if (a<=90 && a >=80) {
		grade='B';
	}else if (a <=80 && a>=70) {
		grade ='C';
	}else {
		grade='F';
	}
		return grade;
	}
	public static void main(String[]args) {
		
		CreatMethod obj=new CreatMethod();
		 System.out.println( obj.getGrade(75));
	}

}
