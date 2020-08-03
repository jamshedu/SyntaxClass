package com.syntaxclass33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.*;
public class ProcessDataFromXL {

	public static void main(String[] args) throws IOException{
	
	
		String filePath= "/Users/dzhamshedumarov/eclipse-workspace/JavaProjects/testdata/TestData.xlsx";
				
	FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		int row=sheet.getPhysicalNumberOfRows();
		int cel=sheet.getRow(0).getLastCellNum();
		
		List<Map<String,String >>listMap=new ArrayList<>();

		for (int r=1;r<row; r++) {
			
			Map <String,String>map=new LinkedHashMap<>();
			for(int c=0; c<cel;c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			listMap.add(map);
			
		}
		System.out.println(listMap);
		for(Map<String,String>list:listMap) {
			Set<String>str=list.keySet();
			for(String str1:str) {
				System.out.print(str1+"--->"+list.get(str1));
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
