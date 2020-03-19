package com.syntax.class8;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		
		Scanner s;
		double price;
		
		s= new Scanner(System.in);
		price=s.nextDouble();
		do {
			System.out.println("Please pay for a caandy");
		}while (price !=2);
		System.out.println("Enjoy your candy");
		
		System.out.println();
		
		
	}

}
