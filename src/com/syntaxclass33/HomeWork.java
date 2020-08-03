package com.syntaxclass33;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your userName  ");
		
		String str = scan.nextLine();
		if(str.length()<8) {
			throw new RuntimeException("Please enter right userName and not more then 8 char");
		}else {
			System.out.println("it is excepted");
		}
	}

}
