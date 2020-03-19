package com.syntaxclass10;

public class Recope {

	public static void main(String[] args) {
		int grade[]=new int[4];
		grade[0]=90;
		grade[1]=67;
		grade[2]=87;
		grade[3]=78;
		
		int avarage =(grade[0]+grade[1]+grade[2]+grade[3])/4;
		System.out.println("avarage "+grade);
		
		System.out.println("===============");
		
		String[]cities= {"Washington,DC","New Yourk","Paris","Miami","Los Angeles","Dallas","Chantilly"};
		// I live in Paris
		System.out.println("I live in "+cities[2]);
		int x= 1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to "+cities[x]);
		
		// how many elements store inside an array
		int arraySize=cities.length;//7
		System.out.println("Total element "+arraySize);
		
		// how can access last element from an array?
		System.out.println(cities[arraySize]);
		// access all elements from an array
		//cities[0] cities [1],cities[2]
		for (int i = 0; i < arraySize; i++) {
		System.out.println(cities[i]);
		}
	}

}
