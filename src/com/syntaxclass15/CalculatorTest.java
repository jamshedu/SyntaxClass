package com.syntaxclass15;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calc	=new  Calculator();
		
		calc.add(100, 200);
		calc.sub(1000, 300);
		
	//	calc.add(100.99, 200.99);
	//	calc.add( 200);
		
		calc.add(1000, 200);
		calc.sub(10, 3);
		calc.mult(20, 10);
		calc.div(20, 10);
		//System.out.println(calc.div2(20, 10));
		
		//double div2=calc.div2(20, 10); //2.0
		
		//System.out.println(div2);
		
		
	}

}
