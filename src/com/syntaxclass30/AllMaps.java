package com.syntaxclass30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	
	
	public static void main(String[] args) {
		//lets create a grocery map (item, quantity)in which we do not care about the order
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		System.out.println(grocery);
		
		System.out.println("11#################################################");

		//create a map of items to buy (item, quantity) in which we want save the order
		Map<String, Integer> household=new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towel", 3);
		household.put("toilet paper", 10);
		household.put("face mask", 50);
		System.out.println(household);
		
		System.out.println("2-------------------------------");
		
		//create a map in which we store all previous items in ascending order
		Map<String, Integer> shopping =new TreeMap<>(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		System.out.println("3_______________________________________________");
		
		//get all keys using loop
		for(String key:shopping.keySet()) {
			System.out.println("Key: "+key);
		}
		System.out.println("4---$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		//get all keys using iterator
		Iterator<String> it=shopping.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("Key="+it.next());
		}
		System.out.println("5%%%%++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		//get all values using loop
		for(int val:shopping.values()) {
			System.out.println("Value:"+val);
		}
		System.out.println("6<<<<<=========================================================");
		
		//get all values using iterator
		Iterator<Integer> iterator=shopping.values().iterator();
		while(iterator.hasNext()) {
			System.out.println("value = "+iterator.next());
		}
	}

}
