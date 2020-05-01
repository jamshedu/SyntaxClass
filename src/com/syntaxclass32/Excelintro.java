package com.syntaxclass32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelintro {

	public static void main(String[] args) throws IOException {
	
		String filePath="/Users/dzhamshedumarov/eclipse-workspace/JavaProjects/testdata/TestData.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
	    //accessing workbook
		Workbook book=new XSSFWorkbook(fis);
		//accessing row
		Sheet sheet=book.getSheet("Sheet4");
	Row	row1=sheet.getRow(0);
	//accessing cell
	Cell cell=row1.getCell(1);
	//get value from cell
	String r1cell2=cell.toString();
	System.out.println(r1cell2);
	
	//how to get CA
	Row row3=sheet.getRow(2);
	Cell r3c3=row3.getCell(3);
     String cellValue=r3c3.toString();
     System.out.println(cellValue);
     
     // how to get NY
       cellValue=sheet.getRow(1).getCell(3).toString();
     System.out.println(cellValue);
     
     //to retrieve value base on type
     double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv);
		
		// how to get 90012 in a String format
		String valC=sheet.getRow(1).getCell(4).toString();
		System.out.println(valC);
		String []arr=valC.split("\\.");
		System.out.println(arr[0]);
		
				
	
	}

}
