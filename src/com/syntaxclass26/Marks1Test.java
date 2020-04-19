package com.syntaxclass26;

public class Marks1Test {
	
	public static void main(String[] args) {
		StudentA1 student1=new StudentA1(80,90,95);
		double averageP=student1.getPercentage();
		System.out.println(averageP+" % ");
		
		System.out.println("===========================");
		
		StudentB1 student2=new StudentB1(90,89,95,90);
		averageP=student2.getPercentage();
		System.out.println(averageP+" %");
	}

}
