package com.syntaxclass15;

public class Task3Palindrome {
	
	void isPalindrome(String word) {
		char []array = word.toCharArray();
		String reverse="";
		for (int i =array.length-1; i>=0; i--) {
		reverse+=array[i];
	}
	
	if (reverse.equalsIgnoreCase(word)) {
		System.out.println("Word is palindrome");
	}else {
		System.out.println("Word is not palindrom");
		
	}
}
	public static void main(String[] args) {
		Task3Palindrome obj = new Task3Palindrome();
		obj.isPalindrome("Madam");
	}
}