package com.syntaxclass11;

public class Tesk1InClass2DArray {

	public static void main(String[] args) {
		  
		String[][]car = {{"American", "German"},
				        { "Korean", "Italian"}
		           };
		
		for (String[] maker:car) {
			for (String values:maker) {
				System.out.println(values+" ");
			}
			System.out.println();
		}
		System.out.println("===========");
		
		String[][] countries= {{"Peru", "Brazil", "Argentina"},
				{"America", "Canada", "Mexico"},
				{"Germany", "Spain", "France", "Italia"},
				{"China", "Tajikistan", "Russia", "Uzbakistan"},
				{"Zimbabia", "Moraco", "Egept"}
				};
		int count=0;
		for (String []world:countries) {
			for(String c : world) {
				System.out.println(c+" ");
				count++;
				
			}
			System.out.println();
		}
		
	}

}
