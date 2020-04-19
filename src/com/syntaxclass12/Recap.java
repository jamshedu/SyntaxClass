package com.syntaxclass12;

public class Recap {

	public static void main(String[] args) {
		
		
		String str=""; //empty value
		System.out.println(str.isEmpty());
		
		String str1= null;//empty value
		
		// System.out.println(str1.isEmpty()); CE->NullPointerException
		
		String str2="Good Morning";
		String str3="students";
		String str4="!";
		
       //"Good morning "-> "Good morning"->"Good morning students"->
		
		str2=str2. trim().      concat(str3).
				//"Good Morningstudents!"
				concat(str4);
		System.out.println(str2);
				
	
				
				
		
		String str5 ="Day";
		int date= 25;
		//str5.contcat(date);CE:change type
		String str6 = "Hello";
		String str7 ="syntax";
		
		//str6=str6.concat(str7).trim():
		str6=str6.trim().concat(str7);
		System.out.println(str6);
		
		System.out.println("=====");
		
		String c = "Hello i love java";
		  boolean var;
		  var = c.startsWith("hello");
		  System.out.println(var);
		
		     
	}

}
