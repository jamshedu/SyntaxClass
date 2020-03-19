package com.syntaxclass10;

public class Tesk01 {

	public static void main(String[] args) {
		
		String[]enimals=new String[6];
		enimals[0] ="Dog";
		enimals [1]="Cat";
		enimals[2]="Hors";
		enimals[3]="Monkey";
		enimals[4]="Lion";
		enimals[5]="Tiger";
		for (String enimal:enimals) {
			if (enimal.equals("Dog")) {
				System.out.println( " Your favarite animals is "+ enimal);
			}else {
				System.out.println(enimal);
			}
		}
	}

}
