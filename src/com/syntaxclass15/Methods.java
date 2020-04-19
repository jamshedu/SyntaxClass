package com.syntaxclass15;

public class Methods {
	
	void sayWelcome() { 
		for (int i =0; i<=10; i++) {
			System.out.println("Welcome");
		}
	}
	//create method that will say word #number of times
	
	void sayAnything(String word,  int time) {
		for (int i=1; i<=time; i++) {
			System.out.println(word);
		}
	}
	
	//create a method  isItRainind 
	//that will accept boolean value as a param
	// and based on the value it will print message accordingly 

	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("It is raining stay home learn Java ");
		}else {
			System.out.println("It is not raining go for a walk");
		}
		
	}
}
