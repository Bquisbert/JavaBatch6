package com.syntax.class17;

public class StaticKeywordTest {
public static void main(String[] args) {
	
// access static members from another class
	StaticKeyword.brand="Android";
	
	StaticKeyword.screen=true;
	
	StaticKeyword.displayInfo();
	
	StaticKeyword obj1=new StaticKeyword();
	
	obj1.color="green";
	obj1.mem=128;
	obj1.displaySpecs();
	
	
	StaticKeyword obj2=new StaticKeyword();
	
	obj2.color="grey";
	obj2.mem=128;
	obj2.displaySpecs();
	obj2.displayInfo();
	
	
	
}
	
}
