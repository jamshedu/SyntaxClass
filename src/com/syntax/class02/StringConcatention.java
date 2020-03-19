package com.syntax.class02;

public class StringConcatention {

	public static void main(String[] args) {
	
		
		
		String name = "Anna";
		// Display in console Good morning Anna 
		System.out.println("Good morning " + name );
		
		int day = 22;
		// Today is September 22
		System.out.println("Today is September  " + day);
		
		String text = "Today is September ";
		System.out.println(text + day );
		
		int num1 = 12;
		int num2 = 13;
		//The value of  num1= ___and the value of num2___
		System.out.println("The value of num1 = " +num1+"and the value of num2"+num2 );
		
		String fruit = "apple";
		char dollar = '$';
		double price = 1.99;
		// The price of apple is $1.99!!
		System.out.println("The price of " + fruit + " is " +dollar + price + "!!");
		
	}

}
