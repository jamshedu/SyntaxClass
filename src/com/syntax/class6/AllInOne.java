package com.syntax.class6;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		
		/*
		 * write a program to ask user if there is a sale 
		 * if no sale ---> not going shopping 
		 * if sale we will ask the price of the itenom
		 * based on the price we will apply discount and calculate final price
		 * 
		 * if price less than 20---> apply 10%
		 * if price between 20 and 100 ---> apply 20%
		 * if price between 100 and 500 --> apply 30%
		 * if price between than 500--> apply 50%
		 * 
		 * after discount___ the price of the item reduce from___to ___
		 */
		
		
		Scanner scan;
		String sale ;
		double price;
		double discount;
		double finalPrice;
		scan= new Scanner(System.in);
		
		System.out.println("Is there is sale");
		
		sale = scan.nextLine();
		
		if (sale.equals("yes")) {
			
			System.out.println("What is the price");
			
			price=scan.nextDouble();
			
			if (price<=20) {
				
				 discount = price*0.1;
				 
			}else if (price > 20 && price <=100) {
				
				discount=price*0.2;
			
			}else if (price>100 &&  price <= 500) {
				
				discount=price*0.3;
			}else {
				
				discount=price*0.5;
				
			}
			finalPrice=price-discount;
			System.out.println("After "+(100-(finalPrice*100)/price)+ " percent discount the price of the item reduced from "+ price + " to " + finalPrice);
			  
			
//			$ 50 -->> 100%               40*100=4000  4000/50=80   --- 100%-80%=20%
//			$ 40--->> ?  80%	    	 $10 --> 20%	
			
			
			// $ 80 --> 100%             64*100=6400  6400/80=80    100-80 =20%    
			// $ 64 --> ? 80%            $16 --->> 20%
			
		}else {
			
			System.out.println("No shopping today");
		}
		
}
			
}
	
		
	


