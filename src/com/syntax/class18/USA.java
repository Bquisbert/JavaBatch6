package com.syntax.class18;

public class USA {
	
	String state,capital;
	
	
	public void display() {
		System.out.println(state+" and its capital is "+capital);
	}
	
	public USA(String usaSTATE,String usaStateCap) {
		
		state=usaSTATE;
		capital=usaStateCap;
		
	}
	
	public static void main(String[] args) {
		
		
		
		USA usa=new USA("Virgina","Richmond");
		usa.display();
		
		
		
		
		
		
		
	}

}
