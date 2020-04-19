package com.syntaxclass16;

public class Ricap {
	
	 int sum(int a, int b) {
		 return a+b;
	 }
     void sum1(int a, int b) {
    	 System.out.println(a+b);
     }
     public static void main(String[] args) {
		Ricap obj=new Ricap();
		//obj.sum(10, 12);
		 obj.sum1(22, 10);
		System.out.println(obj.sum(12, 13));
	}
}
