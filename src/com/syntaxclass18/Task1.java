package com.syntaxclass18;

public class Task1 {
	
	Task1(){
		System.out.println("This is first constractors");
	}
    Task1(String str){
    	System.out.println("I learn constractors "+str);
    }
    
    
    public static void main(String[] args) {
    	
    	Task1 obj =new Task1();
    	Task1 obj1= new Task1("right now");
		
	}
}
