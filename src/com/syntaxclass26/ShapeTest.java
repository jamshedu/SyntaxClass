package com.syntaxclass26;

public class ShapeTest {
	
	
		/*
		 * Create an Interface 'Shape' with undefined methods as calculateArea and
		 * calculatePerimiter. Create 2 classes Circle & Square that implements
		 * functionality defined in the Shape Interface. Test your code.
		 */

		public static void main(String[] args) {

			Shape circle=new Circle();
			circle.calculateArea(10);
			circle.calculatePerimeter(20);
			
			Shape square=new Square();
			square.calculateArea(10);
			square.calculatePerimeter(20);
		}


}
