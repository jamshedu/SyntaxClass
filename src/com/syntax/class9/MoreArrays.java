package com.syntax.class9;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
		
		String[]students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aron";---->during run time java machine will give 
		//   ArrayIndexOutOfBoundsException
		// System.out.println(students[3]);
		System.out.println(students[2]);
		// if we store less elements than we declared 
		// compiler will add default value
		
		String[] inClassStudents=new String[5];
		 inClassStudents[0]="Hichem";
		 inClassStudents[1]="Tetteh";
		 inClassStudents[2]="Hichem";
		 inClassStudents[3]="Tetteh";
		 inClassStudents[4]="Tetteh";
		 //  inClassStudents[5]="Hichem";--->will get ArrayIndOfBoundException
		 System.out.println( inClassStudents[2]);
	}

}
