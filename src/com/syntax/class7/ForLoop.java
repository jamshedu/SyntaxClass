package com.syntax.class7;

public class ForLoop {

	public static void main(String[] args) {
		
		
		// good morning 5 times
		
		for (int c = 1; c < 6; c++) {
			System.out.println("Good morning");
		}
		// print number from 1 to 10
		for (int i = 10; i >= 1; i --) {
			System.out.print(i);
		}
		// print number 10 to 1
		for (int i = 10 ; i >=1; i--) {
			System.out.print(i);
		}
		// what will be the output
		for (int i = 0; i <= 50; i+=5 ) {
			System.out.print(i);
		}
		// what is the output
		int sum =0;
		for (int i = 1 ; i <5; i++) {
			sum = sum+i;
		}
		System.out.println("Value of sum "+sum);
	}

}
