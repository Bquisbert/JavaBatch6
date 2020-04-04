package REPLHW;

public class Repl131 {

	public String name;
	private String city;
	protected String school;
	int batch;
	
	void display() {
		System.out.println("My name is "+name+" and I live in "+city+"."+" I study at "+school+" in batch "+batch);
	}
	
	
	public static void main(String[] args) {
		
Repl131 mm=new Repl131();


mm.name="John";
mm.city="Miami";
mm.school="Syntax";
mm.batch=6;

mm.display();
		
		
		
		
		
		
	}
	
	
	
	
	
}
