package com.syntax.class8;

import java.util.Scanner;

public class Task3InClass {

	public static void main(String []args) {
		
		Scanner scan;
		int stared;
		int point;
		int num=0;
		int james=0;
		scan=new Scanner(System.in);
		
		System.out.println("Please enter the range of  number (stared and end point) ");
		
		stared=scan.nextInt();
		point=scan.nextInt();
		for (int sam= stared; sam<=point;sam++) {
			if (sam%2 ==0 ) {
				num+=sam;
			}else {
				james+=sam;
				
			}
			
		}
		System.out.println(num);
		System.out.println(james);
		
	}	
	}
