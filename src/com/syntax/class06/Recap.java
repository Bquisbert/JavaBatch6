package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if hour is between 1-11---> it is morning
//if hour is between 12-15---> it is afternoon
//if hour is between 16-20--> it is evening
//if hour between 21-24----> it is night
	
	int hour=96;
	
	String timeOfDay;
	if(hour>=1 && hour<=11) {
		timeOfDay="morning";
	}else if (hour>=12 && hour<=15) {
		timeOfDay="afternoon";
	}else if (hour>=16 && hour<=20) {
		timeOfDay="evening";
	}else if (hour>=21 && hour<=24) {
		timeOfDay="night";
	}else {
		timeOfDay="unknown";
	}
	
	
	if (!timeOfDay.equals("unknown")) {
		System.out.println("right now is "+ timeOfDay);
		
	}
	
	
	
	
	
	
	
	}

}
