package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer[] computer= {new Apple("Apple"),new Lenovo("Lenovo"),new Hp("Hp"),new Dell("Dell")};
	
	
   for(Computer c:computer) {
	   c.display();
	   c.logo();
	   c.screen();
	   c.keyboard();
	   System.out.println("==========");
   }
   
   for(int i=0;i<computer.length;i++) {
	   
   }
   
}
}