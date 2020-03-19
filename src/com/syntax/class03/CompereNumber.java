package com.syntax.class03;

public class CompereNumber {
	
	public static void main(String []args) {
		
		
		double numberOne = 10 ;
		double numberTwo = 10;
		
		if (numberOne>numberTwo) {
			System.out.println("Number one is larger than number 2");
			
		}else if (numberOne<numberTwo) {
			System.out.println("Number one is small than number 2");
			
		}else {
			System.out.println("Numbers are equal");
		}
		System.out.println("_________________________");
		
		// declare a variable for a day and than based on the value we will provide output 
		
		int day = 6;
		if (day==1 ) {
			System.out.println("It is Monday we don't have class");
		}else if (day==2 ) {
			System.out.println("It is   Tuesday we have a SDLC Class ");
		}else if (day== 3) {
			System.out.println("It is wednesday we have SDLC class");
			
		}else if (day==4) {
			System.out.println("It is thursday we have review class");
		}else if (day==5) {
			System.out.println("It is Friday no class");
		}else if (day==6) {
			System.out.println("It is the saturday we have java class");
			
		}else if (day==7){
			System.out.println("It is sunday we have java class ");
			
		}else {
			System.out.println("Invalid weekday");
		}
		
	}

}
