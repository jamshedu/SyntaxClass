package com.syntaxclass30;
import java.util.*;
import java.util.Map.Entry;



public class PracticeMap {

	public static void main(String[] args) {
		
		
		
		
		Map<String,Integer>map=new HashMap<>();
		map.put("John", 32);
		map.put("Mark", 33);
		map.put("Jane", 25);
		map.put("Lora", 30);
		System.out.println(map);
		
		Map<String,Integer>listMap=new TreeMap<>();
		listMap.put("Mike", 20);
		listMap.put("Johny", 35);
		listMap.put("Alex", 33);
	     
	     System.out.println(listMap);
	     
	     List<Map<String,Integer>>list=new ArrayList<>();
	     list.add(map);
	     list.add(listMap);
	     System.out.println(list);
	     
	     
	     for(Map<String,Integer>map1:list) {
	    	Set<String>set=map1.keySet();
	    	for(String str:set) {
	    		System.out.println("Name is "+str+" age is "+map1.get(str));
	    	}
	    }
	 	System.out.println("-------Entry-------------------");
	 list.forEach(System.out::println);
	 Iterator<Map<String, Integer>>it1=list.iterator();
	 
		 for(Map<String, Integer> entry: list) {
			 for (Map.Entry<String, Integer> val : entry.entrySet()) {
			        System.out.println(val.getKey() + " : " + val.getValue());
			    }
		 }
		 
	 
	 
	 
	     
	     
	     }
	}


