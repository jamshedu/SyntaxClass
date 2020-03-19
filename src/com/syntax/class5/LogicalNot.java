package com.syntax.class5;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean b = !true ;
		boolean val= !false;
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold = false;
		if (!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		String day1 = "Monday";
		
		//if it is not Monday or Friday ---> find me at Syntax
		
		if (!day1.equals("Monday")|| day1.equals("Friday")) {
			System.out.println("Find me at Syntax");
		}else {
			System.out.println("Find me at the libray");
		}
		
				

	}

}
