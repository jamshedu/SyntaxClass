package com.syntaxclass13;

public class StringRevers {

	public static void main(String[] args) {
		
		
		String str="jamshed";
		int size=str.length();
		for(int i=size-1; i>=0; i--) {
			str+=str.charAt(i);
		}
		str=str.substring(size);
		System.out.println(str+" ");
		
		
		int []array= {500,400,300,349,488,550,600,4};
		int smalest =array[0];
		int largest =0;
		int largest2=0;
		
		for (int i =0; i <array.length; i++) {
			int element = array[i];
			
			if (element >largest) {
				largest2=largest;
				largest=element;
				}else if(element >largest2) {
					largest=element ;
				}
			if (element <smalest) {
				smalest=element ;
			}
			
		}
		System.out.println("Largest "+largest);
		System.out.println("2 Largest "+largest2);
		System.out.println("Smalest "+smalest);
		
		String str1="Jamshed";
		for(int i=str.length();i>=0; i--) {
			System.out.print(str1.charAt(i-1));
		}
//		String str2="jamshed";
//		int revers=0;
//		revers=str2.length();
//		for(int i = 0; i<revers)
//				
				
	}

}
