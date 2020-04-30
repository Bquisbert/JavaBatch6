package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath=System.getProperty("user.dir")+"\\testdata\\Test.xlsx";
		
	FileInputStream fis=new FileInputStream(filePath);
	
	Workbook wbook =new XSSFWorkbook(fis);
	
	Sheet sheet=wbook.getSheet("Sheet2");
	
	
	int rows=sheet.getPhysicalNumberOfRows();
	
	//find number of columns
	int cols=sheet.getRow(0).getLastCellNum();
	
	for(int r=0; r<rows;r++) {//iterates over rows
		for(int c=0; c<cols; c++) {//iterates over cols
			String cellVal=sheet.getRow(r).getCell(c).toString();
			System.out.print(cellVal+"  ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
