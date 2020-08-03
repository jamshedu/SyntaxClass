package com.syntax.class8;

public class Recope {

	public static void main(String[] args) {
		
		for (int i = 20; i<=50; i++) {
			if (i % 2!=0) {
				System.out.print(i);
			}
		}
		System.out.println(); 
		
		int total =2;
		for ( int k =1; k<4; k++) {
			total = total * 4;
			System.out.print(" Final "+total);
		}
	}

}
