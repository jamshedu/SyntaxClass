package com.syntax.class5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		
		Scanner userInput= new Scanner(System.in);
		
		System.out.println("How long you are working  with company");
	
		int year = userInput.nextInt(); 
		if(year>= 5) {
			
			System.out.println("What is your anual salary");
			double salary = userInput.nextDouble();
			if (salary>= 100000) {
				
				
			}
			
		}
	}

}
