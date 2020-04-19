package com.syntax.class9;

public class Recap {

	public static void main(String[] args) {
		
		for (int i = 1; i<=3 ; i++) {
			for (int j = 1; j<=3; j++) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println("==========");
		
		// using nested loop to print 10 until 99
		
		for ( int i =1 ; i <=9; i++) {
			for (int y =0; y <=9; y++) {
				System.out.print(i+ " "+y);
			}
		}
		System.out.println("==================");
		
		for (int a = 0; a <=23; a ++) {
			for (int b = 0; b<=59; b++) {
				
		    if (b <10) {
		    	System.out.print(a+":0" +b);
		    }else {
		    	System.out.print(a+ ":"+b);
		    }
			}
		}

		System.out.println("==========");
		for (int c = 0; c <=9 ;c++ ) {
			for (int d = 9; d<=9; d++) {
				for (int e = 0; e<= 9; e++) {
					for (int f =0; f<=9; f++) {
						System.out.print(c+""+d+e+f);
					}
				}
			}
	}
	}

}
