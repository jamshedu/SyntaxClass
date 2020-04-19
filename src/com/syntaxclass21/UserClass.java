package com.syntaxclass21;

public class UserClass {
	
	
	String name;
	int number;
	UserClass(String name, int number){
    this.name=name;
	this.number=number;
}
}
class UserInfo extends UserClass{
	
	String address;
	UserInfo(String name, int number, String address){
		super(name,number);
		this.address=address;
	}
		public void userDetails() {
			System.out.println(name+""+number+""+address);
		}
	}
	
	
	
