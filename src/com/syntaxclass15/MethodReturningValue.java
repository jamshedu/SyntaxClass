package com.syntaxclass15;

public class MethodReturningValue {
	
	
public static void main(String[] args) {
		
		// create String and  base on the length of the String 
		// we define whether String is short or long
		
		String str ="Hello my friend";
		int length =str.length();
		
		if (length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}		
		MethodReturningValue newObject = new MethodReturningValue();
		int num =newObject.largest(12, 30);
		System.out.println(num);
		
}

//compare 2 number and then we identify whether largest number is even or odd
//create a method that return largest number from 2 given number
	
	 int largest (int a, int b) {
		 int largest ;
		 
		 if (a >b) {
			 largest=a;
		 }else{
			 largest =b;
		 }
		 
		 return largest;
		 
	 }


}