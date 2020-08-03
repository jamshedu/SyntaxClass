package com.syntaxclass32;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonHomeWork {

	public static void main(String[] args) throws IOException {
		

	String filePath=System.getProperty("user.dir")+"/testdata/TestData.xlsx";
	
	FileInputStream fis = new FileInputStream(filePath);
	
	Workbook book = new XSSFWorkbook(fis);
	
	Sheet sheet = book.getSheet("Sheet4");
	
	int row=sheet.getPhysicalNumberOfRows();
	int col=sheet.getRow(0).getLastCellNum();
	
	 List<Map<String,String>>listMap=new ArrayList<>();
	 for (int r=1; r<row;r++) {
		 Map<String,String>map=new LinkedHashMap<>();
      for(int c=0; c<col; c++) {
    	 String key= sheet.getRow(0).getCell(c).toString();
    	 String value=sheet.getRow(r).getCell(c).toString();	
    	 map.put(key, value);
      }
      listMap.add(map);
}
	System.out.println(listMap);
		
		
		
		
		
		
		
		
		
		
		
		}

}
