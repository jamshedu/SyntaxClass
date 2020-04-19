package com.syntaxclass13;

import java.util.Scanner;

public class Ripl3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		// write your code below
		
		String newString = "";
		for (int i = 0; i <= newString .length() - 1; i++) {
			
			if(i!=newString .length()-1) {
				newString = newString + newString .charAt(i) + " ";
			}else {
				newString = newString + newString .charAt(i);
				
			}
			
		}
		System.out.println(newString);
	   
			 
	   	 
	   	
	   	

	}

}
