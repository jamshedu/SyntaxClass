package com.syntaxclass12;

import java.util.Scanner;

public class Task2InClass {

	public static void main(String[] args) {
		
		String str1="!";
		String str2="Syntax";
		 
		//for(int i =0; i <str2.length(); i++) {
		//	for (int j=6; j>str2.length(); j+=2) {
					System.out.println(str2.length());
					
					System.out.println("===========");
					
					Scanner inp = new Scanner(System.in);
				    System.out.print("In:");
				    String givenString = inp.nextLine();
				   	//write your code below
				   	
					   	String reverse ="";
					   	for (int i= givenString.length()-1; i>=0; i--){
					   	  reverse+=givenString.charAt(i);
					   	}
					   	
					   	System.out.println(givenString.equals(reverse));
				   	 
				   
				   	
				}
				
			
		}
	


