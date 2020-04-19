package com.syntaxclass18;

public class Book2 {
	
	
	String book1;
    String book2;
    Book2(String a , String b){
        this();
        book1=a;
        book2=b;
        System.out.println(a+b);
}
   Book2() {
        
        System.out.println("i like this book");
    }
    
    public static void main(String[] args) {
        
        
        Book2 obj = new Book2("Live "," Love");
        
    }

}
