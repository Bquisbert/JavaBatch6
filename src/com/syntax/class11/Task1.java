package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[][] cars= {
			{"Ford","Mustang","jeep"},
			{"BMW","Audi","mercedes"},
			{"Toyota","honda","Acura"},
			{"Fiat","lamborghini","maserati"}
		
	};
	
	for(int r=0;r<cars.length;r++) {
		for(int c=0;c<cars[r].length;c++) {
			System.out.print(cars[r][c]+" ");
		}
		System.out.println();
	}
	
	
	for(String[] make:cars) {
		for(String country:make) {
			System.out.print(country+" ");
		}
		System.out.println();
	}
	
	
	//-----------------------------------------------------------------------------------
	
	
	
	String[][] countries= {
			{"US","Canada","Hawaii"},
			{"Brazil","Argentina","Columbia"},
			{"England","Germany","France"},
			{"china","Japan","cambodia"},	
			
	};
	for(int r=0;r<countries.length;r++) {
		for(int c=0;c<countries[r].length;c++) {
			System.out.print(countries[r][c]+" ");
		}
		System.out.println();
	}
	System.out.println("--USING ADVANCED--");
	
	int count=0;// counts all elements stored
	
	for(String[] con:countries) {
		for(String c:con) {
			System.out.print(c+" ");
		count++;//<---- every loop it get incremented and counted
		}
		System.out.println();
	}
	
	System.out.println("total countries= "+count);
	
	}

}
