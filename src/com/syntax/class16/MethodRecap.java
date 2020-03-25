package com.syntax.class16;

public class MethodRecap {

	// create method that will accept array of intergers and return max element
	int getLargest(int[] array) {
		int largest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}

	// create method that will accept string and return each word from given string

	String[] getWords(String str) {
		String[] array = str.split(" ");
		return array;
	}

	public static void main(String[] args) {

		MethodRecap obj = new MethodRecap();

		int[] ar = { 10, 20, 38, 12 };
		obj.getLargest(ar);
		System.out.println(obj.getLargest(ar));
		
		
		String myString="it is a beautiful word";
	String[]	word=obj.getWords(myString);

	for(String w:word) {
		System.out.println(w+" ");
	}
		

	}

}
