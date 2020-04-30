package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath="configs\\Task.properties";
		
		FileInputStream fis=new FileInputStream(filePath);	
		
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		System.out.println(browser+"-->"+url);
		
		
		
		
		
		
		
		
		
	}

}
