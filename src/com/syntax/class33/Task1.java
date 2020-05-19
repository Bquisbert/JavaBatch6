package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
	
	public static List<Exception> getAllExceptions(){
		List<Exception> exceptionList= new ArrayList<>();
		int []array= {1,2,3};
		//1st obj of exception type
		try {		
			System.out.println(array[4]);	
		}catch (ArrayIndexOutOfBoundsException aob) {
			
			exceptionList.add(aob);
		}
		//2nd obj of exception type
		try {
			Object ob = new Double (50);
			Integer i = (Integer) ob;
		} catch (ClassCastException e) {
			exceptionList.add(e);
		}
	//3rd obj of exception type
	try {
		String str="HEllO";
		char str1=str.charAt(10);
		
	}catch (StringIndexOutOfBoundsException se) {
		
		exceptionList.add(se);
	}
	String filePath="";
	//4th obj of exception types
	try {
		FileInputStream fis= new FileInputStream(filePath);
	}catch (FileNotFoundException fe) {
		
		exceptionList.add(fe);
	}
	
	
	
	return exceptionList;
	}
	

	public static void main(String[] args) {

	
	List<Exception>	list=getAllExceptions();
		System.out.println(list.size());
		
		
		Iterator<Exception> eit=list.iterator();
		
		while (eit.hasNext()) {
		String message=	eit.next().getMessage();
		System.out.println(message);
		}
		
		
		
		
	}

}
