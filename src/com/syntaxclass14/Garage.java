package com.syntaxclass14;

public class Garage {

	public static void main(String[] args) {
		
		
		// build individual object
		
	   Car car1	=new Car();
	   car1.make="Toyota";
	   car1.model="Camry";
	   car1.color="White";
	   car1.year=2019;
	   
	   
	   Car car2=new Car();
	   car2.make="BDW";
	   car2.model="m5";
	   car2.color="Black";
	   car2.year=2020;
	   
	   //print BDW
	   
	   System.out.println(car1.make);
	   
	   // I drive black BDW
	   System.out.println("I drive "+car2.color+" "+car2.make);;
	   car1.drive();
	   car1.accelarate();
	   car1.makeNoise();
	   car1.stop();

	   //accesing behavir/method of car with
	   car2.drive();
	   car2.accelarate();
	   car2.makeNoise();
	   car2.stop();
	   
	   System.out.println("I drive "+car2.color+" "+car2.make);

	   Car car3=new Car();
	   car3.make="123";
	   car3.speed=200;
	   
	   Car2 anotherCar=new Car2();
		anotherCar.make="Toyota";
		anotherCar.speed=90;
		anotherCar.drive();
	   
	}

}
