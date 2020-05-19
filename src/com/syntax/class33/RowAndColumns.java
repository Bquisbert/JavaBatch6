package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowAndColumns {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Diana");
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\Book1.xlsx";
		
		System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		System.out.println("Brain");
		Sheet sheet=book.getSheet("Sheet1");
		
		
		
		int row=sheet.getPhysicalNumberOfRows();
	
		int cols= sheet.getRow(0).getLastCellNum();
		
		System.out.println("Yovi");
		
		
		
	}

}
