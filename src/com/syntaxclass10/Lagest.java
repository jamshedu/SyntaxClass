package com.syntaxclass10;

public class Lagest {

	public static void main(String[] args) {
		
		// find largest element from an array
		int[] num = {200,30, -1, 900, 56, 787};
	     int largest=num[0];
	     for(int i =0; i<num.length; i++) {
	    	 if (num[i]>largest) {
	    		 largest=num[i];
	    	 }
	     }
	     System.out.println("Largest number is "+largest);
		
     System.out.println("===============");
       
     
	}

}
