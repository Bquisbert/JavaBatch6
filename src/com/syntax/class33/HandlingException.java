package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {
	public static void main(String[] args) {
		
	
	
	try {
		Thread.sleep(2000);
	}catch (InterruptedException e){
		System.out.println("Catched InterruptedException Exception ");
	}
	
	String filePath="";
	
	try {
		FileInputStream fis=new FileInputStream(filePath);
	}catch (FileNotFoundException fne) {
		System.out.println("Catched FileNotFound Exception");
	}
		
	
	int a=10;
	int b=0;
	
	try {
		System.out.println(a/b);
	}catch(ArithmeticException ae) {
		System.out.println("Catched ArithmeticException Exception");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
