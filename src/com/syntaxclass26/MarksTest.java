package com.syntaxclass26;

public class MarksTest {
	
	/*
	 * We have to calculate the average of marks obtained in three subjects by student A and by student B. 
	 * Create class 'Marks' with an abstract method 'getPercentage' 
	 * that will be returning the average percentage of marks. 
	 * Provide implementation of abstract method in classes 'A' and 'B'. 
	 * The constructor of student A takes the marks in three subjects as its parameters 
	 * and the marks in four subjects as its parameters for student B. 
	 * Test your code
	 */
		
		public static void main(String[] args) {
			Marks st1 = new StudentA(54, 76, 37);
	        Marks st2 = new StudentB(54, 82, 44, 100);
	        System.out.println(st1.getPercentage());
	        System.out.println(st2.getPercentage());
		}

}
