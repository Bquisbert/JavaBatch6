package REPLHW;

public class Repl118 {

	String country;
	String capital;
	long pop;
	
	
	
	void sentence() {
		System.out.println("The capital of "+country+" is "+capital+" and population is "+pop);
	}
	
	public static void main(String[] args) {
		
		
		Repl118 obj=new Repl118();
		
		obj.country="USA";	
		obj.capital=" Washington DC ";
		obj.pop=330000000;
		obj.sentence();
		
		Repl118 mm=new Repl118();
		mm.country="Kazakhstan";
		mm.capital="Astana";
		mm.pop=18500000;
		mm.sentence();
		
	}
	
	
		
	
	
	
	
	
	
	
	
	
}
