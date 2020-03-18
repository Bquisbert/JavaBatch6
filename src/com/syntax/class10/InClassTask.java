package com.syntax.class10;

public class InClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] animals= {"dog","cat","fish","bird"};
	
	for(int i=0;i<animals.length;i++) {
		System.out.println(animals[i]);
	}
	
	for(String animal:animals) {
		System.out.println(animal);
	}
	
	int[] num= {1,2,3,4,5,};
	
	int sum=0;
	for(int i:num) {
		sum+=i;
	}
	
	
	
	System.out.println(sum);
	
	System.out.println("-----------------------------------------------------------------");
	
	String [] countries= {"USA", "Turkmenistan","Russia","Turkey","France"};
	
	for (int i=0; i<countries.length; i++) {
		if (i==0) {
			System.out.println("USA: Washington DC");
		}else if (i==1) {
			System.out.println("Turkmenistan: Ashgabat");
		}else if (i==2) {
			System.out.println("Russia: Moscow");
		}else if (i==3) {
			System.out.println("Turkey: Ankara");
		}else if (i==4) {
			System.out.println("France: Paris");
		}
	}
	

	
	}

}
