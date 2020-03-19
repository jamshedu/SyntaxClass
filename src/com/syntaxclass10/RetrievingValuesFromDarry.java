package com.syntaxclass10;

import java.util.Arrays;

public class RetrievingValuesFromDarry {

	public static void main(String[] args) {

		String[][]month= {
				      {" January ", "February", " December "}, //1
		             {"March","April", "May"},  //2
		             {" June "," July","August "," September " },
		             {"October","November"}
		};
		int rows=month.length;//how many arrays
		int  firstArray =month [3].length;
		System.out.println(firstArray);
		System.out.println(Arrays.deepToString(month));
		
		for (int i =0; i <month.length; i++) {//iterates over rows
			
			for(int j=0; j<month[i].length; j++) {//iterates over columns
				
				System.out.print(month[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
