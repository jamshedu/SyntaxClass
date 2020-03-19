package com.syntax.class7;

import java.util.Scanner;

public class PracticeLoop {

	public static void main(String[] args) {
		
		Scanner scan;
		scan= new Scanner(System.in);
		int number;
		int luckyNumber =17;
		do {
			System.out.println("Please enter number 1 to 20 ");
			number = scan.nextInt();
			if (number> 20 || number <1) {
				System.out.println("Invalid number, please enter between 1 to 20 ");
			}
			}while (number != luckyNumber); 
		
		System.out.println("You got a lucky number ");

		

	}

}
