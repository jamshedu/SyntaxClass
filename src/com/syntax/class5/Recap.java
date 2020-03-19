package com.syntax.class5;

import java.util.Scanner;

public class Recap {
	
	public static void main(String[]args) {
		
		 Scanner john = new Scanner(System.in);
		 
		 System.out.println("Print any text");
		 String text1 = john.nextLine();
		 
		 if (text1.equals("jamshed")) {
			 System.out.println("Ask him he is age  ");
		 }else if (text1.equals("He is single")) {
			 System.out.println("He has girlfriend");
		 }else {
			 System.out.println("He is married");
		 }
		 
		 

		
		
		
	}

}
