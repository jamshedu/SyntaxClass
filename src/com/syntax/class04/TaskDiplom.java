package com.syntax.class04;
import java.util.Scanner;
public class TaskDiplom {

	public static void main(String[] args) {
		
		
		boolean hasDiplom = true;
		double gPa = 3.4;
		
		if (hasDiplom) {
			System.out.println("Congratulation");
			if (gPa>=3.5) {
				System.out.println("You are eligable  for scholarship");
				
			}else {
				System.out.println("You should have studied harder ");
			}
	
		}else {
			System.out.println("Get a degree");
		}
	}

}
