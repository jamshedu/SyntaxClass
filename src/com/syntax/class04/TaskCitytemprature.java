package com.syntax.class04;
import java.util.Scanner;

public class TaskCitytemprature {

	public static void main(String[] args) {
		
     double cel, far;
     Scanner input = new Scanner(System.in);
     
     System.out.println("What is your city ");
     String city = input.nextLine();
     
     System.out.println("What is the temperature in your city");
     far = input.nextDouble();
     
     cel = (far - 32)*5/9;
     //temp=(temp-32)*(5/9)
     
     System.out.println("The temprature in the city of "+city +"is "+cel);
     
	}

}
