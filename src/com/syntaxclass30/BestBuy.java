package com.syntaxclass30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BestBuy {
	
	
	public static void main(String[] args) {
		
		
		   Map<Integer, String> bestBuy = new TreeMap<>();
	        bestBuy.put(7664847 ,"Printer");
	        bestBuy.put(7879885,"TV");
	        bestBuy.put(333333,"Iphone") ;
	        bestBuy.put(435343,"Laptop") ;

	        System.out.println(bestBuy );

	        System.out.println("--------loop----------------");
	        
	        for(Entry<Integer,String>inter:bestBuy.entrySet()) {
	        System.out.println("Key is "+inter.getKey()+" values is "+inter.getValue());
	        }
	        
	        System.out.println("=======Iterater===============");
	        
	        

	      
	}

}
