package com.syntax.class8;

public class PracticeClass8 {

	public static void main(String[] args) {
		 
		
		int totalEven=0;
		int totalOdd=0;
		for (int num = 1; num <=99; num++) {
			if (num%2==0) {
				totalEven += num;
			    
			}else {
				totalOdd+=num;
				
			}
			
		}
		System.out.println("Total even number is "+totalEven);
		System.out.println("Total odd number is "+totalOdd);
		
		System.out.println("=======");
		
		
		for ( int num = 2; num<= 21; num++) {
			
			System.out.print(num+ " ");
			num+=1;
		}
	}

}
