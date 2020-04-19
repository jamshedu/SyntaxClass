package com.syntaxclass16;

public class RecapMethod {
	
	int largestNumber(int []array) {
		int largest=array[0];
		for (int i=0; i<array.length; i++) {
			
			if (array[i]>largest) {
				largest=array[i];
			}
			
		}
		return largest;
	}
     public static void main(String[] args) {
    	 
    	 RecapMethod obj=new RecapMethod();
    			 
    			 int []number = { 23, 49, 58,100, 2999};
    			 System.out.println(obj.largestNumber(number));

    	 }    	
}
