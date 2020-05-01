package com.syntaxclass32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSheet5 {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/dzhamshedumarov/eclipse-workspace/JavaProjects/testdata/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet5");
//		String str=sheet.getRow(0).getCell(2).toString();
//		System.out.println(str);
		int rows=sheet.getPhysicalNumberOfRows();
		int colls=sheet.getRow(0).getLastCellNum();
		//double num=sheet.getRow(1).getCell(2).getNumericCellValue();
		//System.out.println((int)num);
		for(int r=0; r<rows; r++) {
			for(int c=0; c<colls; c++) {
				String value=sheet.getRow(r).getCell(c).toString();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
	}

}
