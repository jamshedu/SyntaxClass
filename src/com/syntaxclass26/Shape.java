package com.syntaxclass26;

public interface Shape {
	
	void calculateArea(double x);

	void calculatePerimeter(double x);
}

class Circle implements Shape {
	@Override
	public void calculateArea(double x) {
		System.out.println("The area of the given circle is " + (3.14 * x * x));
	}

	@Override
	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of the given circle is " + (2 * 3.14 * x));
	}
}

class Square implements Shape {
	public void calculateArea(double x) {
		System.out.println("The area of the given square is" + (x * x));
	}

	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of the given square is " + (4 * x));
	}
}



