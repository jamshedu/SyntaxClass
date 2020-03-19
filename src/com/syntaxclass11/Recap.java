package com.syntaxclass11;

public class Recap {

	public static void main(String[] args) {
		
		String [][]groceries = {{"cucumber", "potato", "carrot"},
				{"mongo", "apple", "banana", "kiwi"},
				{"milk", "cheese", "yogurt"}
				};
		System.out.println(groceries[2][1]);
		//get all values from 2d array
		// loop through rows
		for (int r =0; r<groceries.length; r++){
			// loop columns
			for (int c=0; c<groceries[r].length; c++) {
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("--gettting elements using advance for loop-- ");
		//loops through all arrays
		for (String[]array:groceries) {
			for(String  items:array) {
				// loop through each array
				System.out.print(items+" ");
			}
			System.out.println();
		}
	}

}
