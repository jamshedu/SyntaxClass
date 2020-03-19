package com.syntaxclass10;

public class Task3Creatcountry {

	public static void main(String[] args) {
		 
		String[]country = {"Tajikistan","USA","Russia","Saudi","Iran"};
		
		for (String i :country) {
			if (i.equals("Tajikistan")) {
				System.out.println(i + " capital is Dushanbe");
			}else if (i.equals("USA")) {
				System.out.println(i+ " capital is Washington");
			}else if (i.equals("Russia")) {
				System.out.println(i+ " capital is Moscov");
			}else if (i.equals("Saudi")) {
				System.out.println(i+ " capital is Riyaz");
			}else if (i.equals("Iran")) {
				System.out.println(i+ " capital is Tehran");
			}else {
				System.out.println(" we dont know the capital");
			}
		}
        System.out.println("==============");
        for (int y=0; y<country.length; y++) {
        	switch(country[y]) {
        	case "Tajikistan":
        		System.out.println("Capital is Dushanbe");
        		break;
        	case "USA":
        		System.out.println("Capital is Washington DC");
        		break;
        	case "Russia":
        		System.out.println("Capital is Moscov");
        		break;
        	case "Saudi":
        		System.out.println( y+" Capital is Riyadth");
        		break;
        	case "Iran":
        		System.out.println("Capital is Tehran");
        		break;
        	}
        }
	}

}
