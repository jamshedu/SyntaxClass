package com.syntax.class04;

import java.util.Scanner;
public class TaskLoan {

	public static void main(String[] args) {
		
		
		try (Scanner task = new Scanner(System.in)){
			System.out.println("How much loan you need ");
			int loan = task.nextInt();
			
			if (loan>200000) {
				System.out.println("You have been rejected for a loan ");
			}else {
				System.out.println("You have been approved for a loan ");
			}
		}

	}

}
