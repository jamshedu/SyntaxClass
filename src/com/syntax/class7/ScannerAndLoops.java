package com.syntax.class7;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		// we want to ask user's name and print Good Afternoon
		
		Scanner input; 
		String name ;
		int num=1;
		
		input=new Scanner(System.in);
		while (num<=5) {
		System.out.println("What is your name");
		name = input.nextLine();
		
		System.out.println("Good afternoon " + name);
		
		num++;
		}
		// we are playing a lottery and a lucky number is 17
		// we want to keep asking user any number from 1 - 20
		// until he guess the lucky number  ---> congrats
		
		
		
	}

}
