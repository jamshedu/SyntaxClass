package com.syntax.class7;

public class Task {

	public static void main(String[] args) {
		
		
		// how to print odd number from 1 to 20
		
		// 1 ways incrementing  and if condition
		System.out.println("==========");
		int num= 1;
		while (num < 20) {
			System.out.println(num);
			num+=2;
			
		}
		// 2 way using mod and if condition
		System.out.println("______________");
		int num4 =1;
		while (num4 <20) {
			if (num4 % 2!=0) {
			System.out.println(num4);
			
		}
			num4++;
		}
		System.out.println("_____________");
		//3 way 
		int y = 1;
		while (y <=20) {
		System.out.println(y++);
		y++;
		}

	}

}
