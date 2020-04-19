package com.syntax.class6;

import java.util.Scanner;

public class OnceValue {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String language;
		 scan = new Scanner(System.in);
		System.out.println("Please enter your country" );
         country = scan.nextLine();
         
         
        
         switch (country) {
         case "Tajikistan":
        	 language ="Tajik";
        	 break;
         case "Russia":
        	 language = "Russian";
        	 break;
         case "America":
        	 language = "English";
        	 break;
         case "Oman":
        	 language = "Arabic";
        	 break;
         case "Iran":
        	 language = "Farsi";
        	 break;
         case "France":
        	 language = "French";
        	 break;
        	 default:
        		 language = "Unknown";
        }
         System.out.println("Your language is " + language);
	}

}
