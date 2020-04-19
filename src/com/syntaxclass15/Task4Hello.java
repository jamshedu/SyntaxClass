package com.syntaxclass15;

public class Task4Hello {

	void country1(String country) {
		switch (country) {
		case "Tajikistan":
			System.out.println("Salam");
			break;
			
		case "USA":
			System.out.println("Hi");
			break;
			
		case "Russia":
			System.out.println("Privet");
			break;
		case "India":
			System.out.println("Namaste");
			break;
		case "Spain":
			System.out.println("Hola");
			break;
			default:
			System.out.println("Wrong language");
		}
	}
	public static void main(String[] args) {
		Task4Hello obj=new Task4Hello();
		obj.country1("Tajikistan");
		obj.country1("USA");
		obj.country1("Russia");
		obj.country1("Moraco");
	}
}
