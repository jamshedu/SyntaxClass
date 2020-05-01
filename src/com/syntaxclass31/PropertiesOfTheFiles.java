package com.syntaxclass31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOfTheFiles {

	public static void main(String[] args) throws IOException {
		
		
		String filePath="/Users/dzhamshedumarov/eclipse-workspace/JavaProjects/configs/Examples.properties";
       System.out.println(filePath);
       
		String userDirectry= System.getProperty("user.dir");
		System.out.println(userDirectry);
		
		String filePath1= System.getProperty("user.dir"+"/configs/Examples.properties");
		
		
		String username=System.getProperty("username.name");
		System.out.println(username);
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
