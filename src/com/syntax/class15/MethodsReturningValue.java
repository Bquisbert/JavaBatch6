package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//create a string and based on length
		//we will define if it is short or long
		
		String str="Hello my friend";
		
		
	int length=str.length();
		
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}
		
		
		
		//compare 2  numbers and tell me which is larger
		Task1 obj= new Task1();
		
		
	//int	num=obj.num1(5, 10);  since num1 doesnt return value we can not save it to num
		
		MethodsReturningValue obj2=new MethodsReturningValue();
		
		int num=obj2.largest(7, 4);
		System.out.println(num);
		
		boolean flag=obj2.isOdd(num);
		System.out.println(flag);
		
		
		System.out.println("Largest number is "+num+ " Is it odd?"+ flag);
	}
	
	//RETURNS largest number
	int largest(int a, int b) {
		
		int largest;
		
		if(a>b) {
			largest=a;
		}else {
			largest=b;
		}
		
		return largest;
		
		
	}
	
	boolean isOdd(int num) {
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		
		return isOdd;
		
	}
	
	
	

}
