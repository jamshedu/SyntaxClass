package com.syntax.class5;

import java.util.Scanner;

public class Task4HW {

	public static void main(String[] args) {
		
		Scanner lol = new Scanner(System.in);
		System.out.println("Please enter your first  number");
		double num1 = lol.nextDouble();
		System.out.println("Please enter your second number");
		double num2 =lol.nextDouble();
		System.out.println("Please enter your third number");
		double num3 =lol.nextDouble();
		double larger=0;
		if (num1>num2 && num1>num3) {
			larger= num1;
		}else if (num2>num3 && num2>num1 ) {
			larger=num2;
		}else {
			larger = num3;
		}
		
		System.out.println("Large number: " +larger);
	}

}
