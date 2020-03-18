package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 4;
		String dayName = null;
		if (day == 1) {
			dayName = "monday";
		} else if (day == 2) {
			dayName = "tues";
		} else if (day == 3) {
			dayName = "wed";
		} else if (day == 4) {
			dayName = "thur";
		} else if (day == 5) {
			dayName = "fri";
		} else if (day == 6) {
			dayName = "sat";
		} else if (day == 7) {
			dayName = "sun";
		}
		System.out.println("today is " + dayName);
		System.out.println("-----------USING SWITCH---------");

		String today=null;
		switch (day) {

		case 1:
			today = "monday";
			break;
		case 2:
			today="tuesday";
			break;
		case 3:
			today="wednesday";
			break;
		case 4:
			today="thurs";
			break;
		case 5:
			today="friday";
			break;
		case 6:
			today="saturday";
			break;
		case 7:
			today="sunday";
			break;
			default :
			today="invalid";

		}
System.out.println("today is "+today);
		
		
		
	}

}
