package com.syntaxclass11;

public class StringDemo {

	public static void main(String[] args) {
		
         String school =("Syntax");
         System.out.println(school.length());
         
         String str=new String ("Hello");
         int size =str.length();
         System.out.println("String length is "+size);
         String newString = str+ " "+" "+ school;
         System.out.println(newString);
         
         String str1 ="This a String 7676,&^&^";
         
         //how many characters String has
         System.out.println("--------length function-------");
         
        
         
         
         // convert String to lowercase or uppercase
         System.out.println("--------ToUppercase / tolowercase function");
         
         System.out.println(school.toUpperCase());
      System.out.println( str.toLowerCase());  
      
      str=str.toLowerCase();
      System.out.println(str);
      
       System.out.println("-----Concat function--------");  
       
      // concatinate 2 String
    
    
    String day ="Saturday ";
    String date=" 14";
    String newDate=day.concat(date);
    System.out.println(newDate);
    
    char grade ='A';
    String str2="Student";
    
    // bellow code will give CE
    // since concat() method is used to attach 1 String to another String
    // str2.concat(grade);
         System.out.println("-----isEmpty Function-----");
         //tells true if there is no characters inside the String 
         // tells false if any characters 
         String str3= "";
         boolean empty=str3.isEmpty();
         System.out.println(empty);
         
         System.out.println("------trim() Function------");
         //remove empty/white space at the beginning and end of the String
         
         String str4="Welcome to Syntax!  ";
         
         
         str4 = str4.trim();
         System.out.println("String with no leading or trailing space: "+str4);
  

	}

}
