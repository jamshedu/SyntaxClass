package com.syntaxclass16;

public class LocalVarabales {

	void nameInside() {

 		String name="John";//local variable that visible only within method it was declared
 		//System.out.println(obj);
 		System.out.println("His name is "+name);
 	}

 	void anotherName() {

 		String name="Jane";
 		System.out.println("Her name is "+name);
 	}

 	public static void main(String[] args) {

 		//System.out.println(name);CE: name won;t be visiable to another method 
 		//since its scope only within nameInside method

 		LocalVarabales obj=new LocalVarabales();
 		obj.nameInside();
 		obj.anotherName();
 		

 		
 	}
	

}