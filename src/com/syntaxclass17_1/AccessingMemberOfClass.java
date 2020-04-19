package com.syntaxclass17_1;

import com.syntaxclass17.Employee;

public class AccessingMemberOfClass {
	
	
	public static void main(String[] args) {
		
		
		Employee obj= new Employee();
		Employee.title="QA Engineer ";
		obj.name="Amad";
		// below variable not available due to 
		//obj.lastName 
		//obj.sallary
		//obj.ssn
		Employee.method1();
		obj.method1();// not prefferable
		// below method not available to restriction 
	//	obj.method2();--->protected 
	//	obj.method3();--->default
	//	obj.method4();--->private
	}

}
