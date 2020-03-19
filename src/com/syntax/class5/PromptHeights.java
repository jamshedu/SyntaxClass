package com.syntax.class5;

import java.util.Scanner;

public class PromptHeights {

	public static void main(String[] args) {
		
		Scanner rom = new Scanner(System.in);
		
		System.out.println("Please enter your hieght in inch");
		int sum = rom.nextInt();
		
		if (sum<60) {
			System.out.println(" You are short ");
		}else if (sum>= 60 && sum <= 72) {
			System.out.println("You are mideum");
			
		}else if (sum >= 72 ) {
			System.out.println("You are taller");
		}else {
			System.out.println("Invalid height ");
		}
		
	}

}
