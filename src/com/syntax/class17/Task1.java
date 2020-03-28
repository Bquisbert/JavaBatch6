package com.syntax.class17;

public class Task1 {

	
	protected  int ints(int[] array){
            int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		
int[] b= {2,1,10,5};

int arr=obj.ints(b);
System.out.println("the sum of all ints in array are "+arr);
		
	}
	
	
	
	
}
