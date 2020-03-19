package com.syntaxclass12;

import java.util.Scanner;

public class Task2InClass2 {

	public static void main(String[] args) {
		
		
		String str="Today is great day";
		str=str.replace(" ", "");
      System.out.println(str);
      
      System.out.println("=============");
      
      
      //task 2

      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a string:");
      String text = scan.nextLine();
      
      if (!text.isEmpty()) {
    	  if (text.length()%2==1 && text.length()>=3) {
    		  System.out.println(text.charAt((text.length())/2));
    	  }else {
    		  System.out.println("Even number of characters");
    	  }
      }
      System.out.println("=====================");
      // task 3
      
      Scanner input=new Scanner(System.in);
      
      System.out.println("What is your Mom's first name");
      String name1=input.nextLine();
      
      System.out.println("What is your Dod's first name ");
      String name2=input.nextLine();
      
      System.out.println("Boy or Girl");
      String babyName=input.nextLine();
      
      String suggestedBName=null;
      
      int half1=name1.length()/2;
      int half2=name2.length()/2;
      
      
    		  
      
      
      
      
}
}