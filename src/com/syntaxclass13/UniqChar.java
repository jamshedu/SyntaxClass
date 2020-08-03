package com.syntaxclass13;

public class UniqChar {
	
	
	
	
	public static  String uniqChar(String str) {
		
		
		String result="";
		for(int i = 0; i<str.length();i++) {
			if (result.contains(""+str.charAt(i))) {
				continue;
			}
			result+=str.charAt(i);
		}
		return result;
			
		
	}
	public static void main(String[] args) {
		
		System.out.println(uniqChar("Banana"));
		
	}
}

