package com.syntaxclass17;

public class Task2String {
	
	protected static String str(String str1) {
		
		String revers = "";
		
		for (int i =str1.length()-1; i>=0; i--) {
			revers+=str1.charAt(i);
		}
		return revers;
	}
       
	
	public static void main(String[] args) {
		
	String str=	Task2String.str("Sunday");
		
		
		System.out.println(str);
		
	}
}
