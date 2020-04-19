package com.syntaxclass13;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] numbers = { 32, 61, 16, 89, 74, 25 };
		// 1st way
		Arrays.sort(numbers);
		System.out.println("Smallest " + numbers[0]);
		System.out.println("Biggest " + numbers[numbers.length - 1]);
		System.out.println("Second Largest " + numbers[numbers.length - 2]);
		// 2nd way
		System.out.println("---2nd way---");
		int[] numbers2 = { 10, 61, 16, 89, 74, 101 };
		int smallest = numbers2[0];
		int largest = 0;
		int largest2 = 0;
		for (int i = 0; i < numbers2.length; i++) {
			int element = numbers2[i];
			// check if it is bigger than the largest
			if (element > largest) {
				largest2 = largest;
				largest = element;
			} else if (element > largest2) { // check if it is bigger than second largest
				largest2 = element;
			}

			if (element < smallest) {
				smallest = element;
			}
		}
		System.out.println("Smallest " + smallest);
		System.out.println("Biggest " + largest);
		System.out.println("Second Largest " + largest2);

		// third way
		int[] arr = { -1, 100, 199, 89, 74, 1 ,0 };
		//Array should be sorted
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Smallest " + arr[0]);
		System.out.println("Biggest " + arr[arr.length - 1]);
		System.out.println("Second Largest " + arr[arr.length - 2]);
		
		System.out.println("======");
		int i,j, k;
		for(i =0; i <=5; i++) {
			for (j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(k=5-i; k>=0; k--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
