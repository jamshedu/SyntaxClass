package com.syntax.class5;

public class MoreLogiclOperators {
 
	public static void main(String[]args) {
		
		/* We have total 7 days in week 
		 * if day is 2,3 --> SDLC Class 
		 * if day 6 ,7 ---> Java Class 
		 * if day 1,5 ---> off Day 
		 * if day 4--> review class 
		 */
		
		int day = 7 ;
		
		if (day ==2 || day ==3) {
			System.out.println("Today is SDLC");
		}else if (day==6 || day==7) {
			System.out.println("Today is Java class");
		}else if (day==1 || day==5) {
			System.out.println("Today is no class, it is day off");
		}else if (day==4) {
			System.out.println("Today is  a review class with Elion");
		}else {
			System.out.println("Invalid day");
			}
		System.out.println("_______using string___________");
		//To compare String we use equals
		String day1 = "Saturday";
		
		if (day1.equals("Tuesday") || day1.equals("Wednesday") ) {
			System.out.println("Today is SDLC Class");
		}else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java class");
		}else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("Today is day off no  class");
		}else if (day1.equals("Thursday")) {
			System.out.println("Today is review class");
		}else {
			System.out.println("Invalid day");
		}
			
			
		
		
	}
}
