package com.syntaxclass12;

public class SplitFunction {

	public static void main(String[] args) {
		System.out.println("-----split()FUNCTION------");
		
		String today ="Today is my favorite Java class";
		
		String[]array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java class";
		String [] stringArray=today1.split("a");
		//print all elements from array 1 by 1 
		// (elements type variableName:name of array)
		for (String    arr       :stringArray) {
			System.out.print(arr+" ");
		}
		System.out.println();
		System.out.println("=================");
		// we want to print String word by word
		String today2="Today is my favorite Java class";
		String[] word=today2.split(" ");
		
		for (int i=0; i<word.length; i++) {
			System.out.print(word[i]+"   ");
		}
		System.out.println();
		System.out.println("-----------TRIM-------------");
		
		String  today3 = "Today is my favorite Java class";
		today3=today3.trim();
		System.out.println("String after trimming:"+today3);
	}

}
