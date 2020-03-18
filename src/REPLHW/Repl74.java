package REPLHW;

public class Repl74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that creates an array of integers of size 11. Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values. 
//
//		Example: 
//		2010
//		2011
//		2012
//		2013
//		2014
//		2015
//		2016
//		2017
//		2018
//		2019
//		2020

		// int[] years= {2010,2011,2012,2013,2014,2015,2016,17,18,19,20};

		// for (int i=0;i<years)

		int[] numbers = new int[11];
		numbers[0] = 2010;
		numbers[1] = 2011;
		numbers[2] = 2012;
		numbers[3] = 2013;
		numbers[4] = 2014;
		numbers[5] = 2015;
		numbers[6] = 2016;
		numbers[7] = 2017;
		numbers[8] = 2018;
		numbers[9] = 2019;
		numbers[10] = 2020;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
