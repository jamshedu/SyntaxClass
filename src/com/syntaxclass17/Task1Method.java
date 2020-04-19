package com.syntaxclass17;

public class Task1Method {
	
	private  int sum(int[] array){
    int num = 0;
		for(int i =0; i<array.length; i++) {
			num=num+array[i];
		}
		
		return num;
		
	}
	public static void main(String[] args) {
		
		Task1Method number=new Task1Method();
		
		int [] a = {25, 30, 40, 45};
		int arr= number.sum(a);
		System.out.println("total: "+arr);
	}

}
