package com.syntaxclass11;

import java.util.Scanner;

public class TaskInClass {

	public static void main(String[] args) {
		
		
		
		String username;
		String password;
		String confirmedPassword;
	    Scanner input=new Scanner(System.in);
		 
		System.out.println("Please enter your username ");
		
		username=input.nextLine();
		
		System.out.println("Please enter your password:");
		 password=input.nextLine();
		
		if (!(username.isEmpty()|| password.isEmpty())) {
			if (password.length()>=8) {
				
				if (!password.contains(username)) {
					
					System.out.println("Please confirm password ");
					
				   confirmedPassword=input.nextLine();
				   
			      if (password.equals(confirmedPassword)) {
			    	  
			    	  System.out.println("Your account is created ");
			    	  
			      }else {
						System.out.println("Password are not matched ");
					}
				}else {
					System.out.println("Password cannot contain username");
				}
			}else {
				System.out.println("Password is too short");
			}
		}else {
			System.out.println("Username and password cannot be empty");
			
		}
		

	}

}

