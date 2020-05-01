package com.syntaxclass30;

import java.util.Map.Entry;
import java.util.*;

import java.util.LinkedHashMap;
import java.util.Map;




public class Employee {

	public static void main(String[] args) {
		
		
		
		  Map<String, Double > map= new LinkedHashMap<>();

	        map.put("John", 3500.0);
	        map.put("Mike",4000.0);
	        map.put("Ahmet",70000.0);
	        map.put("Rohani",80000.0);
	        
	        double highest =Collections.max(map.values());

	      Set<Entry<String,Double>>mapSet=map.entrySet();
	       
	      for(Entry<String,Double>salary:mapSet) {
	    	  if(salary.getValue()==highest) {
	    		  System.out.println(salary.getKey()+" works realy hard ,thats why he gets "+salary.getValue()+" a year.");
	    	  }
	    	  
	      }
	      
		
	}

}
