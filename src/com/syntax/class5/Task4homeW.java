package com.syntax.class5;

import java.util.Scanner;

public class Task4homeW {

	public static void main(String[] args) {

		Scanner jova = new Scanner(System.in);
		System.out.println("Please enter your number ");
		int sum1 = jova.nextInt();
		int sum2 = jova.nextInt();
		int sum3 = jova.nextInt();
		int largest;

		if (sum1 > sum2) {
			if (sum1 > sum3) {
				largest = sum1;
			} else {
				largest = sum3;
			}
		} else {
			if (sum2 > sum3) {
				largest = sum2;
			} else {
				largest = sum3;
			}
		}

		System.out.println("Largest number :" + largest);
	}

}
