package com.syntaxclass13;

import javax.print.DocFlavor.STRING;

public class Q4 {

	public static void main(String[] args) {
		/*
		 * Find out how many alpha characters are present in a String? 
		 * Find number of words in string?
		 */

		String str=" Hih9898jhjh%%^$%^   oio   ";
		str=str.replaceAll("[^A-Za-z]", "");
		int number=str.length();
		System.out.println("Number of alpha character = "+number);
		
		String MYSTRING="TODAY IS WEDNESDAY AND IT IS JAVA CLASS";
		String[] array=MYSTRING.split(" ");
		int words=array.length;
		System.out.println("Total words in string:"+MYSTRING+" = "+words);
		
	}
}
