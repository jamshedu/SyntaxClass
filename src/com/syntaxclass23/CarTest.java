package com.syntaxclass23;

public class CarTest {
	
	public static void main(String[] args) {

		Car bmw = new BMW("BMW");
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda("Honda");

		Car[] cars = { new BMW("BMW"), new Tesla("Tesla"), new Mercedes("Mercedes"), new Honda("Honda") };
		
		for(Car c:cars) {
			c.start();
			c.display();
			System.out.println(" ------------   ");
		}
		
		String str ="Jamshed";
		String revers="";
		for(int i=str.length()-1; i>=0; i--) {		
			revers+=str.charAt(i);
		}
				System.out.println(revers);
	}
	

}
 