package com.syntax.class04;
import java.util.Scanner;

public class TaskDmv {

	public static void main(String[] args) {
		
		Scanner task =new Scanner(System.in);
		System.out.println("How old are you?");

		int age = task.nextInt();
		
		if (age>=18) {
			System.out.println("You can have a driver licence");
		}else {
			System.out.println("Get a learners permit");
		}
	}

}
