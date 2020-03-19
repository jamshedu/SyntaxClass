package com.syntax.class02;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		int num1, num2, sum, sub , mult, div;
		
		num1 =30;
		num2 = 10;
		sum = num1 + num2;
		sub = num1 + num2;
		mult = num1 + num2;
		div = num1 + num2;
		System.out.println(num1 + num2);//40
		System.out.println(num1 - num2 );//20
		System.out.println( num1 * num2 );//300
		System.out.println(num1 / num2);//3
		
		// how can we print value of num1 and num2 together 
		System.out.println(num1+ "" +num2);
		
		
		
		// the result of the addition /sub /mult /dive is = -
		
		System.out.println(" The result of the addition is = " + sum);
		System.out.println("The result of the substruction is =  " +sub );
		System.out.println( "The result of the multiplication is = " + mult );
		System.out.println("The result of the division is =" + div);
	
	}

}
