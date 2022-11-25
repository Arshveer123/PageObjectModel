package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	static FileInputStream fis ;
	static Workbook book;
	
	Object[][] obj= ExcelSheet.getData();
	
	
	
	public static Object[][] getData() {
		try {
			 fis = new FileInputStream("C:\\Users\\HH\\eclipse-workspace\\POMProject\\Book1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet=book.getSheet("sheet1");
		Object[][] obj= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0;i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				obj[i][k]= sheet.getRow(i+1).getCell(k).toString();
				
			}
		}
		return obj;
	}

}
