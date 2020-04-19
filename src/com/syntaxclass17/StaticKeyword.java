package com.syntaxclass17;

public class StaticKeyword {
 
	// create a temple for a phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	
	// return type name parameters 
	static void displayGeneralInfo() {
		System.out.println("We are bulding "+brand+" with tauch screen= "+touchScreen);
	}
	void displaySpacifictions() {
		System.out.println("We building with "+memory+" GB memory in "+color+" color");
	}
	
  //	Static Method can not access non-static member of the class
	//static void displaySpacifictions() {
//	System.out.println("We building with "+memory+" GB memory in "+color+" color");
	//}
	   
		public static void main(String[] args) {
		// accessing static variable in a static way
		brand="iPhone";
		touchScreen=true;
		
		// accessing instance variable through the instance the class
		StaticKeyword obj =new StaticKeyword();
		obj.color="grey";
		obj.memory=64;
		
		// accessing static method in a static way
		displayGeneralInfo();
		
		// accessing static method in non static way/through instance
		
		obj.displaySpacifictions();
		
	}
}
