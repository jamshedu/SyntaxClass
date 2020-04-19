package com.syntax.class5;

public class Task2 {

	public static void main(String[] args) {
	
		
		
		int day = 8;
		if (day >= 1 && day<=5) {
			System.out.println("It is a weekday");
		}else if (day>= 6 && day <= 7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println("______using or______");
		
		 int  day1 =8 ;
		switch (day1){
		case 1:
		System.out.println("Today is Sunday");
		
		break;
		
		case 2:
		System.out.println("Today is Monday");
		
		break;
		case 3: 
			System.out.println("Toay is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wedsday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is Saturday ");
			break;
			default:
			System.out.println("Invalid day ");
		}
		
		
	}

}
