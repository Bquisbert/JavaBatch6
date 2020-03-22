package com.syntax.class15;

public class Methods {


void say() {
	for(int i=0;i<10;i++) {
		System.out.println("Welcome");
	}
		
}

void sayAnything(String word, int times) {
	
	for(int i=0;i<times;i++) {
		System.out.println(word);
	}
	
	
}


void rain(boolean isRain) {
	if(isRain) {
		System.out.println("Stay home and learn Java");
	}else {
		System.out.println("It is not raining, go for a walk");
	}
}




}
