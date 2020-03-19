package com.syntax.class02;

public class ArithmeticOperatorsTask {

	public static void main(String[] args) {
		
		
		// Task 1
		double dec1, dec2, sum, sub, mult,div;
		
		dec1 = 10.11;
		dec2 = 9.99;
		
		sum = dec1 + dec2;
		sub = dec1 - dec2;
		mult = dec1 * dec2;
		div = dec1 / dec2;
		
		System.out.println("The addition of 2 numbers dec1 and dec2 is equal to" + sum);
		System.out.println("The subtraction of 2 numbers dec1 and dec2 id equal to " + sub);
		System.out.println("The multiplication if 2 numbers dec1 and dec2 is equal to " + mult);
		System.out.println("The division of 2 numbers dec1 and dec2 is equal to " + div);
		
		
		// task 2 
		
		
		double dec3 = 3.9;
		double sqr = dec3 * dec3;
		System.out.println("The square of the " + dec3 +"" + sqr);
		
		//Task 3 
		
		int width =5 ;
		int heigh =8;
		int area = width * heigh;
		int per = 2* (width + heigh);
		System.out.println("The perimeter of a rectangele with width "+ width +"and heigh " + heigh +"is equal to "+ per +"and the area is "+area);
		
		String message = "The perimeter of a reactangle with width "+ width+ "and heigh "+ heigh+ "is equal to " + per + " and the area is "+ area;
		System.out.println(message);
		
		String math = " the answer is " + dec3 * dec3;
		System.out.println(math);
		

	}

}
