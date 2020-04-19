package com.syntaxclass14;

public class Store {

	public static void main(String[] args) {
		Phone iphone = new Phone();
		
		iphone.brand="Iphone";
		iphone.color="Black";
		iphone.model="ProX";
		 
		iphone.deal();
		iphone.text();
		iphone.pic();
		
		Phone android = new Phone();
		android.brand = "Samsung";
		android.color = "Black";
		android.model = "Note10";
		android.deal();
		android.text();
		android.pic();
		
		Phone nokia = new Phone();
		nokia.brand = "Nokia";
		nokia.color = "Gray";
		nokia.model = "Nokia 9";
		nokia.deal();
		nokia.text();
		nokia.pic();
		
		
		
		String str="Hello friends";
		str=str.replace("Hello", "Welcome");
		
		System.out.println(str);
		
		
		

	}

}
