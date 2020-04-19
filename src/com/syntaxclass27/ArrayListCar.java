package com.syntaxclass27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCar {
	
	public static void main(String[] args) {
		
		ArrayList<String>cars=new ArrayList<>();
		cars.add("Toyota");
		cars.add("Tesla");
		cars.add("BMW");
		cars.add("Merecedes");
		for(String str:cars) {
			System.out.println(str);
			
		}
		System.out.println("===========");
		
		int i=0;
		while (i<cars.size()) {
			System.out.println(cars.get(i)+" ");
			i++;
		}
		System.out.println("===============");
		
		Iterator<String> str=cars.iterator();
		while (str.hasNext()) {
			System.out.println(str.next()+" ");
		}
			
	}
}
