package com.syntax.class5;
import java.util.Scanner;
public class Task2HW {

	public static void main(String[] args) {
		
		
		Scanner rom =new Scanner(System.in);
		System.out.println("Please enter your score");
		int sum = rom.nextInt();
		//System.out.println("Please enter");
		System.out.println();
		if (sum>=90) {
			System.out.println("Your grade is A");
		}else if (sum>=70 && sum<90) {
			System.out.println("Your grade is B");
		}else if (sum>=50 && sum<70) {
			System.out.println("Your grade is C");
		}else if (sum<50) {
			System.out.println("Your grade is F");
		}else {
			
			System.out.println("You have failed ");
		}
		
		
	}

}
