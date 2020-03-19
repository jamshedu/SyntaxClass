package com.syntax.class6;

import java.util.Scanner;

public class Task3homeW {

	public static void main(String[] args) {
		
		
		Scanner scan; 
		
		int number1;
		
		int number2;
		
		char operator;
		
		 scan = new Scanner(System.in);
		
		System.out.println("Please enter first your number");
		number1 = scan.nextInt();
		
		System.out.println("Enter your operator");
		operator = scan.next().charAt(0);
		
		System.out.println("Please enter your second number");
		number2 = scan.nextInt();
		
		int sum = 0;
		
		switch (operator) {
		
		case '+':
			sum=number1 + number2;
			break;
		case '-':
			sum= number1 - number2;
			break;
		case '*':
			sum= number1 * number2;
			break;
		case '/':
			sum= number1 /number2;
			break;
		default :
			
			System.out.println("You entered worng operator");
					
		}
		
		System.out.println("Result  is " +sum);
		
		
		
	
	}

	
		
	}


