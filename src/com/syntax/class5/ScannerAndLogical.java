package com.syntax.class5;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		
		/* You are a salesman 
		 * ask a user for price of the item
		 * based on the amount of sales we need to calculate commission
		 * if sales is between 1 - 100--> commission should be 10%
		 * if sales is between 100 and 200 --> commission should be 20%
		 * if sales is between 200 and 500 ---> commission should be 30%
		 * if sales is more than 500 --> commission should be 50%
		 */
		
		//1. declare all variables that  i will need 
		
		Scanner scan;
		double sales;
		double commission;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales = scan.nextDouble();
		
		
		if (sales>=1 && sales <= 100) {
			commission=sales*0.10;
		}else if (sales>100 && sales<=500) {
			commission=sales*0.2;
		}
		else {
			commission=sales*0.3;
		}
		System.out.println("Base on your sales your commission is = "+ commission);
		if (commission>100) {
		System.out.println("You are an awesome saller");
		}
	}

}
