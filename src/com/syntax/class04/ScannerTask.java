package com.syntax.class04;

import java.util.Scanner;



public class ScannerTask {

	public static void main(String[] args) {
		//Capture name from a user and print the format
		//My name is _____
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name ");
		String name = scan.nextLine();
		
		System.out.println("Your lastname");
		String lastName= scan.nextLine();
		 
		System.out.println("How old are you");
		int age = scan.nextInt();
		
		System.out.println("Your name is "+name+" last name  is "+lastName+" and your age is "+age);

		
		 
		
	}

}
