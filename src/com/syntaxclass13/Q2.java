package com.syntaxclass13;

public class Q2 {

	public static void main(String[] args) {
		
		int[] fib = new int[10];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < 10; i++) {// to find rest fibonacci until 10
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int j = 0; j < 10; j++) {// number of index
			System.out.print(fib[j] + " ");
		
		}
		
	}

}
