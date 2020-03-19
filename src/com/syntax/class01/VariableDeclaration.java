package com.syntax.class01;

public class VariableDeclaration {
	
	public static void main(String[]args) {
		
		//create a variable and store value
		//1 way: declaring a variable and assigning a value 
		
		boolean b = true ;
		System.out.println(b);
		//2 way: 1 step --> declare variable 
		//       2 step --> assign value 
		int i;
		i = 1000;
		System.out.println(i);
		
		//declare multiple variable and assign value later
		char X, Y ,Z;
		X ='A';
		Y = '^';
		Z = '0';
		System.out.println(X + Y+Z);
		
		//can not have  variable with same name in 	1 program
		// double i = 12.99;--> java will complain 
		
		char z ='#'; // reassigning the value 
		i = 2000;
		
		
		System.out.println(i);
		
		//declaring variable and storing same value 
		int num = 100;
		int num1 = 100;
		System.out.println(z);
		System.out.println(num + num1);
	}

}
