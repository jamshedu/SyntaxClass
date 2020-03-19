package com.syntaxclass10;

public class RetrieveElements {

	public static void main(String[] args) {
		
		char[] grades = {'A','B','C','D','E','F'};
		//getting all elements
		for (int i =0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
			
		}
		System.out.println();
		System.out.println("================");
		
		for (char grade:grades) {
			System.out.print(grade+" ");
		}
		// create an array of fruits and retrieve all elements
		
		String[] fruits= {"Banana","Kiwi","Apple","Mongo"};
		// if fruit is apple -->that is your favorite fruit
		//advance for loop, enhanced for loop, for each loop
		for (String fruit:fruits) {
			if (fruit.equals("Apple")) {
				System.out.println(fruit+ " is your favorite fruite ");
			}else {
				System.out.println(fruit);
			}
			
		}
		System.out.println("----------------");
		// regular for loop 
		// fruits.length=number of element
		for (int i=0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
	}

}
