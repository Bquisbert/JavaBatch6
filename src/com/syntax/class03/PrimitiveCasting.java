package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//widening happens implicitly
		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99 Error 
		//type mismatch, cannot convert double to int
		
		//narrowing, explicitly implementing
		int i=(int)10.99;
		System.out.println(i);
		
		
		//byte -128 to 127
		byte b=(byte)128;
		System.out.println(b);
		
		
		
		
		
		
		
		
		
	}

}
