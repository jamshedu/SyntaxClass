package com.syntax.class5;
import java.util.Scanner;

public class Task3HW {

	public static void main(String[] args) {
		
		Scanner son= new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = son.nextLine();
		String season=null;
		
		
		
		
		if (month.equals("December") || month.equals("February")|| month.equals("January")) {
			season = "Winter";
		}else if (month.equals("March" )|| month.equals( "May")|| month.equals("April")) {
			season ="Spring";
		}else if(month.equals("June" )|| month.equals("July")||month.equals("Augut")) {
			season ="Summer";
		}else if (month.equals("October") || month.equals("November") || month.equals("September")) {
			season ="Autumn";
		}else {
			season="Unknown";
		}
		

		System.out.println("You were born in " + season);
		
				
		
		
		
		
		

}
}