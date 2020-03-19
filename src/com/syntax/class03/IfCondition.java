package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		
		
		//Declare a number and compare if number is larger than 100
		//if number is larger than 100 --> number is large 
		
		System.out.println("starting coding");
		
		int num = 178;
		
		if (num>1000) {
			System.out.println("My number is large ");
		}else
		System.out.println("End of the program");
		System.out.println("___________");
		
		int expectedHours = 15;
		int acturlHours = 15;
		if ( acturlHours > expectedHours) {
			System.out.println("I love my job");
		}else {
			System.out.println("I would not love my job");
		}
		System.out.println("____________");
		
		double budget = 10000;
		double carPrice = 120000;
		if (carPrice > budget) {
			System.out.println("I won't buy a car");
			
	   }else {
		   System.out.println("I would buy the car");
	   } 
			
	}

}
