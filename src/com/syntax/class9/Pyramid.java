package com.syntax.class9;

public class Pyramid {

	public static void main(String[] args) {
		
		for (int r =1; r<=4; r++) {
			for (int c=1; c<=r; c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("===============");
	
		for (int i =1; i<=5; i++) {
			for (int f =1; f<=i; f++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
