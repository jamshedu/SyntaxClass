package com.syntax.class04;
import java.util.Scanner;

public class TaskWorksalary {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of worked years:");
		
		int numYears = in.nextInt();
		int bonus= in.nextInt();
		if (numYears>=5) {
			System.out.println("You are eligibale for a bonus");
			System.out.println("Enter your salary:");
			int salary = in.nextInt();
			
			if (salary>50000) {
				System.out.println("Your bonus is ");
			}else {
				System.out.println("Your bonus is "+ bonus);
			}
		}else {
			System.out.println("You are not eligibale for a bonus");
		}
	}

}
