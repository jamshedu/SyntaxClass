package com.syntaxclass28;

import java.util.ArrayList;

public class WhyIteratorToRemove {
	
	
	
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("water");
		drinks.add("milk");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("tea");
		drinks.add("tea");
		drinks.add("coffee");
		System.out.println(drinks);
		
		//we need to remove all milk and tea String objects
		for(int i=0; i<drinks.size(); i++) {
			
			if(drinks.get(i).equals("milk") || drinks.get(i).equals("tea")){
				drinks.remove(i);
			}
		}
		
		System.out.println(drinks);
		
		
		String str="This is not immutable";
		boolean   retval;
		retval=str.endsWith("immutable");
		System.out.println("Value = "+retval);
		
	     String s = "Sunday";
	     for(int i =s.length()-1;i>=0; i--) {
	    	 System.out.print(s.charAt(i));
	     }
	}
}
