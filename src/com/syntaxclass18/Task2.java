package com.syntaxclass18;

public class Task2 {

	String name;
 	int grade1, grade2, grade3;

 	Task2(String studentName, int studentGrade1, int studentGrade2, int studentGrade3) {
 		name = studentName;
 		grade1 = studentGrade1;
 		grade2 = studentGrade2;
 		grade3 = studentGrade3;
 	}

 	public int gradeAverage() {
 		int total = grade1 + grade2 + grade3;
 		int average = total / 3;
 		return average;
 	}

 	public static void main(String[] args) {
 		Task2 obj1 = new Task2("Ali", 80, 88, 90);
 		System.out.println("Student " + obj1.name + " avarage grade is " + obj1.gradeAverage());

 		Task2 obj2 = new Task2("Ahmet", 85, 78, 90);
 		System.out.println("Student " + obj2.name + " avarage grade is " + obj2.gradeAverage());

 		Task2 obj3 = new Task2("Abdullah", 90, 82, 95);
 		System.out.println("Student " + obj3.name + " avarage grade is " + obj3.gradeAverage());
 	}
}
