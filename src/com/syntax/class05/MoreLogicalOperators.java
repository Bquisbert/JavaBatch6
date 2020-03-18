package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		/*
		 * we have 7 days in a week if day is 2 or 3 --> SDLC if 6,7 we have Java if 1,5
		 * we are off if 4 we have review
		 */

		int day = 6;
		if (day == 2 || day == 3) {
			System.out.println("today is SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("today is Java class");
		} else if (day == 1 || day == 5) {
			System.out.println("today I have off");
		} else if (day == 4) {
			System.out.println("today is review w Elion");
		} else {
			System.out.println("invalid day");
		}

		System.out.println("----------------using string-----------");

		String day1 = "saturday";

		if (day1.equals("tuesday") || day1.equals("Wednesday")) {
			System.out.println("we have SDLC");
		} else if (day1.equals("saturday") || day1.equals("sunday")) {
			System.out.println("We have Java class");
		} else if (day1.equals("monday") || day1.equals("friday")) {
			System.out.println("we have off");
		} else {
			System.out.println("invalid day");
		}

	}
}
