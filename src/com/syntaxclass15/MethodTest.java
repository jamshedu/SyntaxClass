package com.syntaxclass15;

public class MethodTest {

	public static void main(String[] args) {
		
		Methods obj=new Methods();
		obj.sayWelcome();
		obj.sayAnything("Hello", 2);
		obj.sayAnything("Bye", 10);
		//obj.sayAnything(10, "Hello");
		
		
		obj.isItRaining(true);
		obj.isItRaining(false);
	}

}
