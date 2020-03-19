package com.syntax.class04;
import java.util.Scanner;

public class TaskCreditCard {

	public static void main(String[] args) {
		
		Scanner task = new Scanner(System.in) ;
		System.out.println("Do you have a credit card with us ");
		String ans = task.nextLine();
		
		if (ans.equals("no") || ans.equals("No") ||ans.equals("No")) {
			
			System.out.println("If interested, we can help you get one ");
		}
		else if (ans.equals("yes") || ans.equals("Yes")||ans.equals("Yes")) { 
			System.out.println("What is your balance in your credit card ?");
			
			int balance = task.nextInt();
			if (balance >1000) {
				System.out.println("Please pay your balance imediatly ");
			}else {
				System.out.println("You can spend more maney");
			}
		}
		
		else {
			System.out.println("Invalid Input");
		}
	}

}
