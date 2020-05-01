package com.syntaxclass32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.syntaxclass23.WebDriver;

public class HomeWork1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		
		String filePath="/Users/dzhamshedumarov/eclipse-workspace/JavaProjects/configs";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		Properties prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		
		switch(browser) {
		case "google":
			System.setProperty("webdriver.chrom.driver","driver/chromedriver" );
		//	 driver = new ChromDriver();
			
		}
		
		
		
		
	}

	
	}


