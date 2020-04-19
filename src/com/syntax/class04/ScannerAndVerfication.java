package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerfication {

	public static void main(String[] args) {
		
		
		/*
		 * Capture 2 number from a user Compare number and identifi which is large
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		
		int num1 = input.nextInt();
		
		System.out.println("Please enter second number");
		
		int num2 = input.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+ " is large than " + num2);
			
		}else if (num1<num2) {
			System.out.println(num1 + " is less than " + num2);
		}
		else {
			System.out.println("First "+num1 + " is equal to the second " + num2);
			
		}
	 
			
		
		
	}

}
