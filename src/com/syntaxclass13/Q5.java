package com.syntaxclass13;

public class Q5 {

	public static void main(String[] args) {
		
		
		String given="I love Java";
		String reversed ="";
		
		for (int i =given.length()-1; i>=0; i--) {
			reversed =reversed+given.charAt(i);
		}
		
		System.out.println("Reversed String = "+reversed);
		

	}

}
