package com.syntax.class9;

public class MorePatterns {

	public static void main(String[] args) {
		
		for (int i =1; i<5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===============");
		
		for (int s= 5; s>=1; s--) {
			for (int e =1; e<=s; e++) {
				System.out.print(e);
			}
			System.out.println();
		}
		for (int a=1; a<=5; a++) {
			for(int j=1; j<=a; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
