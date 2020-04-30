package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1.write into existing file and add values
		String filePath="configs\\Examples.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("phoneNumber","5712355621");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Added additional key");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
