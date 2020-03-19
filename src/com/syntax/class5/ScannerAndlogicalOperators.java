package com.syntax.class5;

import java.util.Scanner;

public class ScannerAndlogicalOperators {

	public static void main(String[] args) {

		/*
		 * Take input from a user and then base on the age print output if age from
		 * 0-3--> you are a baby if age from 4-5--> you are a kid if age from 6-12-->
		 * you are a child if age from 13-19--> you are teenager
		 * 
		 * 
		 */
		// 1 - let's declare all variables
		int age;
		
		Scanner scan;// tp import we use :
		scan=new Scanner(System.in);
		
		
		System.out.println("Please enter you are age ");
		age =scan.nextInt();
		
		if (age<3) {
			System.out.println(" You are baby");
		}else if (age >= 3 && age <=5) {
			System.out.println("You are kid");
		}else if (age >=6 && age <=12) {
			System.out.println("You are child");
		}else if (age>=13 && age<=19) {
			System.out.println("You are teenager");
		}else if (age>= 20 && age <65) {
			System.out.println("You are an dult ");
		}else {
			System.out.println("You are enjoying your life");
		}

	}

}
