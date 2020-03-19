package com.syntax.class8;

import java.util.Scanner;

public class PracticeForLoop {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String num;
		String credit;
		for (int sum=1; sum<=10; sum++) {
			System.out.println("Would you like to apply for credit card");
			credit=input.nextLine();
			if (credit.equals("yes")) {
				System.out.println("Congratulation");
				break;
			}
		}

	}

}
