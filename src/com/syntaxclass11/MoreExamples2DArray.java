package com.syntaxclass11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		
		
		// lets create 2D array in which we store professions
		
		String [][]professions = {{"QA Tester ", "Devoloper", "Product Owner", "Scrum Master"},
				{"Math Teacher", "Science Teacher", "ELS Teacher"},
				{"Dentist ", "Surgeon"}
				};
		
		// get elements using advance for loop 
		for (String [] accupation:professions) {
			for (String title:accupation) {
				System.out.print(title+" ");
			}
			System.out.println();
		}
	}

}
