package com.syntaxclass12;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		String str="Hello";
        String str1="Hello";
        String str3="World";
        str.concat(str1);
        
        System.out.println(str);
	}

}
