package com.syntaxclass13;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayScanner {

	public static void main(String[] args) {
		
		
		
		
		Scanner input= new Scanner(System.in);
		int [] inhabitants= new int[8];
		
		for(int i =0; i<inhabitants.length; i++) {
			inhabitants[i]=input.nextInt();
			            
	}
      for(int i =0;i<inhabitants.length;i++) {
    	  System.out.println("Day"+i+Arrays.toString(inhabitants));
    	  
    	  int sum=0;
    	  for(int k=0; k<inhabitants.length; k++) {
    		  inhabitants[k]-=inhabitants[k]*.5;
    		  sum+=inhabitants[k];
    		              
    	  }
    	  if(sum==0) {
    		  System.out.println("Day"+(i+1)+Arrays.toString(inhabitants));
    		  System.out.println();
    		  break;
    	  }
      }
	}

}
