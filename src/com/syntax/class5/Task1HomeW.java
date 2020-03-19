package com.syntax.class5;
import java.util.Scanner;

public class Task1HomeW {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height: ");
		
		
		int sum = scan.nextInt();
		
		if (sum<=60) {
			System.out.println("You are short");
		}else if (sum>=60 && sum<=70) {
			System.out.println("You are medium");
		}else  if (sum>=71  && sum <=80) {
			System.out.println("You are taller");
		}
		
	}
}

