package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<String> Cars = new ArrayList<>();

		Cars.add("Bmw");
		Cars.add("Mercedes");
		Cars.add("Ford");

		System.out.println("=== Iterator way===");
		Iterator<String> it = Cars.iterator();
		while (it.hasNext()) {
			String car = it.next();
			System.out.println(car);
		}

		System.out.println("====Advanced FOR LOOP====");

		for (String c : Cars) {
			System.out.println(c);
		}

		System.out.println("=== FOR LOOP===");

		for (int i = 0; i < Cars.size(); i++) {
			System.out.println(Cars.get(i) + " ");
		}

	}

}
