package com.syntax.class02;

public class ModulsOperatore {
	
	public static void main(String[]args) {
		
		float num1 = 12.99f;
		float num2 = 3.4f;
		
		float div = num1/num2;
		System.out.println(div);//number1/ number2 ;
		
		int number1 =13;
		int number2 =2 ;
		int divOfIntegers =number1/ number2 ;//return whole number , remainder won't show 
		System.out.println(divOfIntegers);
		
		double d = 12;
		System.out.println(d);
		// int i = 12.5 ; no Can Do
		
		//modulus give remain of the division 
		int a = 13 ;
		int b =6 ;
		
		int sum = a /b ;
		int remainder = a % b;
		System.out.println(remainder);
		System.out.println("The sum is :" +sum+ " and remainder is "+ remainder );
		
		
	}

}
