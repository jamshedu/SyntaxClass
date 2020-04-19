package com.syntaxclass15;

public class Task1 {
	
	void evenOdd(int a) {
		if (a%2==0) {
			
			System.out.println(a+ " is even number");
			}else {
				System.out.println(a+ " is an odd number");
			}
		
	}
	public static void main(String[] args) {
		
		Task1 number = new Task1();
		number.evenOdd(88);
	}

}
