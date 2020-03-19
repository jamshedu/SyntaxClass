package com.syntax.class6;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		
		
		/* ask a user where he or she is from 
		 * based on the county we will define favorite food 
		 * Your favorite food 
		 * Your favorite food id ______
		 */
		
         Scanner scan;
         String country;
         String favoriteFood;
         
         scan= new Scanner(System.in);
         System.out.println("Please enter your country");
         country=scan.nextLine();
         
         switch (country) {
         
         case "Moraco":
        	 favoriteFood ="Couscous";
        	 break;
         case "Belarus":
        	 favoriteFood= "Potato";
        	 break;
         case "Tajikistan":
        	 favoriteFood ="Osh";
        	 break;
         case "Turkey":
        	 favoriteFood= "Baklava";
        	 break;
         case "Afganistan":
        	 favoriteFood = "Mantu";
        	 break;
         case "Kazakistan":
        	 favoriteFood ="Beshparmak";
        	 break;
        	 default:
        		 favoriteFood = "unkown";
         }
         
         System.out.println("You favorite food is " + favoriteFood);
         
	}

}
