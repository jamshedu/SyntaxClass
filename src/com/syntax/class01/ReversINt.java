package com.syntax.class01;

public class ReversINt {

	public static void main(String[] args) {
		
		int reverse = 0;
		int remainder= 0;
		int number = 245;
		while (number>=1) {
			remainder= number % 10;
			reverse= reverse * 10 +remainder;
			number = number / 10;
		}
		System.out.println(reverse);
		
		
		String str= "Jamshed";
		int size =str.length();
		for(int i = size-1; i>=0; i--) {
			str+=str.charAt(i);
			}
		str=str.substring(size);
		System.out.println("Reverse String is "+ str);
		
		
		int reverse1=0;
		int remainder1=0;
		int number1= 321;
		while(number1>=1) {
			remainder1=number1%10;
			reverse1=reverse1*10+remainder1;
			number1= number1/10;
			
		}
		System.out.println("reverse number is "+ reverse1);
		
		
	}

}
