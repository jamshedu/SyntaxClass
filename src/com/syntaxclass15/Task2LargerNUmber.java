package com.syntaxclass15;

public class Task2LargerNUmber {
	
	void largerNumber(int a, int b) {
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		}else if (b>a ) {
			System.out.println(b+" is larger than "+a);
		}else {
			System.out.println("Numbers are even number");
		}
	}
         
	public static void main(String[] args) {
		
		Task2LargerNUmber number=new Task2LargerNUmber();
		number.largerNumber(60, 60);
		
		
	}
	
	
		 
	 }
	
	
	

