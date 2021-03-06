package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

		//to read file:
		//have file
		String filePath="configs\\Examples.properties";
		
		//2.bring object of fileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);
		
		//to handle data from .properties file we need property Class
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
		//getting all keys from property file
		Set<Object> keys=prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
		
	
		
	}

}
