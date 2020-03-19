package com.syntaxclass11;

public class StringVerification {

	public static void main(String[] args) {
		
		
		String message="Welcome Admin!";
		
		//verify that message contains username which is Admin
		
		System.out.println("-----cantain Function-------");
		
		System.out.println(message.contains("Admin"));
		
		boolean flag = message.contains("Welcome");
		System.out.println(flag);
		
		// we want to see if welcome starts with Welcome 
		System.out.println("---endsWith() Function-----");
		
		boolean starts =message.startsWith("Welcome");
		System.out.println(starts);
		
		
		// we want to verify that welcome message ends with username 
		System.out.println("----endWith() Function-----");
		
		String username ="Admin";
		
		boolean ends = message.endsWith(username);
		System.out.println(ends);
		System.out.println(message.endsWith("!"));

	}

}
