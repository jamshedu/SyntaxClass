package com.syntaxclass18;

public class ConstructorTask2 {
	
	
	String name;
	int grade1, grade2, grade3;
	ConstructorTask2(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
		name=studentName;
		grade1=studentGrade1;
		grade2=studentGrade2;
		grade3=studentGrade3;
	}
	public int gradeAverage() {
		int total=grade1+grade2+grade3;
		int avg=total/3;
		return avg;
	}
	public static void main(String[] args) {
		
		ConstructorTask2 s1= new ConstructorTask2("Tim", 81, 89, 74);
		
		System.out.println(s1.name+"'s average grade is : "+s1.gradeAverage());
		
		ConstructorTask2 s2= new ConstructorTask2("Andrew", 66, 73, 69);
		
		System.out.println(s2.name+"'s average grade is : "+s2.gradeAverage());
		
		ConstructorTask2 s3= new ConstructorTask2("Marsha", 97, 95, 91);
		
		System.out.println(s3.name+"'s average grade is : "+s3.gradeAverage());
	}

}
