package com.syntaxclass11;

public class StringComparison {

	public static void main(String[] args) {
		
		
		String str1 ="Hello";
		
		String str2 = new String("Hello");
		 
		//String str3="Hello";
		
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
			
		}else {
			System.out.println("Strings are not equal");
			
		}
		System.out.println("---Comparing using==Operator");
		
		
		if (str1==str2) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
			
		}
		
		String str3 = "Hello";
		
		
		if (str1==str3) {
			System.out.println("Str1 equal to Str3");
		}else {
			System.out.println("Str1 is NOT equal to Str3");
		}
		
		System.out.println(str2);
		
	}

}
