package com.syntaxclass11;

public class StringValidation {

	public static void main(String[] args) {
		
		
		String str1 ="Welcome Syntax Students";
		
		String str2 ="Welcome Syntax Students";
		
		
		// to compare 2 String
		
		System.out.println("-----equels()equalsIgnoreCase()Function-----");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected ="Home - Syntax Technologies";
		String actual ="Home - Technologies";
		
		if (actual.equals(expected)) {
			System.out.println("Test case fails. Titles are matched");
		
		     }else {
		 System.out.println("Test case fails. Titles are NOT matched");   	
			
		}
		
		System.out.println("---first trim and then compare---");
		
		if (actual.trim().equals(expected)) {
			System.out.println("Test case fails. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
	}

}
