package com.syntaxclass14;

public class Dog {
	
	String breed;
	String color;
	String name;
	int age;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="buuldog";
		dog1.color="brown";
		dog1.name="Charlie";
		dog1.age=5;
		
		
		dog1.eat();
		dog1.bark();
		dog1.run();
		
		Dog dog2=new Dog();
		dog2.breed="Shih thz";
		dog2.color="black";
		dog2.name="Rembo";
		dog2.age=4;
		
		dog2.eat();
		dog2.bark();
		dog2.run();
				
	}
	void eat() {
		System.out.println( name+" can eat ");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
    void run() {
    	System.out.println(name+" can run");
    }
}
