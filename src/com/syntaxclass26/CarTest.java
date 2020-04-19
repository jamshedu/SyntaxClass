package com.syntaxclass26;

public class CarTest {
	
	
	/*
	 * Create a Class Car that would have the following fields: carPrice and color
	 * and method calculateSalePrice() which should be returning a price of the car.
	 * Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
	 * and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned price
	 * car should include 10% discount, otherwise 20% discount. The Sedan class has
	 * field as length and also does it is own implementation of
	 * calculateSalePrice(): if length of sedan is >20 feet then returned car price
	 * should include 5% discount, otherwise 10% discount
	 */
	public static void main(String[] args) {
		Car truck = new Truck(20000.0, "Blue",3000.0);
		System.out.println(truck.calculateSalePrice());
		
		Car sedan = new Sedan(20000.0,"White", 30);
		System.out.println(sedan.calculateSalePrice());
		
	}

}
