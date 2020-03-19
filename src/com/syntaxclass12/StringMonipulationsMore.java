package com.syntaxclass12;

public class StringMonipulationsMore {

	public static void main(String[] args) {
		  // to get substring from given String 
		//substring =String inside your String
		System.out.println("----subtring() Function------");
		
		String str ="Today is a raining day ";
		//is a raining day
		String partialString = str.substring(6);//start from 6 until the end of String 
		System.out.println(partialString);
		
		//rainy day
		
		partialString=str.substring(11);
		System.out.println(partialString);
		
		//Today
		partialString=str.substring(0, 5); // start from 0 end at index 5;
		
		// rainy
		partialString=str.substring(11, 16);
		System.out.println(partialString);
	}

}
