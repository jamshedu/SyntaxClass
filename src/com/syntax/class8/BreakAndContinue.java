package com.syntax.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			if (i == 4) {
				System.out.print("I am stopping loop");
				break;
			}
			System.out.println(i);
		}
         System.out.println("I am outside of the loop ");
         
         System.out.println("=======");
         
        

         System.out.println("=======");
         
         for (int i = 1; i < 21; i++) {
        	 if (i==5 || i ==6 || i ==7) {
        		 continue;
        		 
        	}
        	 System.out.print(i);
         }
         System.out.println("=======");
         
         for (int i = 1; i<=100; i++) {
        	 
        	 if (i >=35 && i <=55) {
        		 continue;
        	 }
        	 System.out.print(i);
         }
         System.out.println("+++++++++++++");
         
         for (int x = 1; x<=100; x++) {
        	 if (x==55 || x==65 || x==75 || x==85 || x ==95) {
        		 continue;
        	 }
        	 System.out.print(x);
         }
	}
         
}
