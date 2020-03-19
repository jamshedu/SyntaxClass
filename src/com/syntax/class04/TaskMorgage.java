package com.syntax.class04;

public class TaskMorgage {

	public static void main(String[] args) {
		
		double rate = 4;
		double price = 350000;
		
		if (rate>4.5) {
			System.out.println("I will not buy a house today ");
		}else {
			System.out.println("I will buy a house ");
			if (price >200000) {
				System.out.println("I will take a loan ");
			}else {
				System.out.println("I will pay cash");
			}
		}
	}

}
