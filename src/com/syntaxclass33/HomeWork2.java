package com.syntaxclass33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class HomeWork2 {
	
	public static List<Object> exception() {
		List <Object>list = new ArrayList<>();
		
		String str="Welcome";
		try {
			char cha=str.charAt(8);
			System.out.println(cha);
		}catch(StringIndexOutOfBoundsException str1) {
			list.add(str1);
//			System.out.println(str1);
//			System.out.println(str1.getMessage());
		}
		
		int a =15;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException num1) {
//			System.out.println(num1);
//			System.out.println(num1.getMessage());
			list.add(num1);
		}
		
		int []arr= {18,15,15};
		try {
			System.out.println(arr[3]);
		}catch (Exception num2) {
//			System.out.println(num2);
//			System.out.println(num2.getMessage());
			list.add(num2);
			}
		String string="";
		try {
			FileInputStream file=new FileInputStream(string);
		}catch(FileNotFoundException str1) {
//			System.out.println(str1);
			list.add(str1);
		}
		return list;
	}
	

	public static void main(String[] args) {
		
		
		List<Object>list=exception();
		
		for(Object it:list) {
			System.out.println(it);
		
		
		}
		
		
		
	}

}
