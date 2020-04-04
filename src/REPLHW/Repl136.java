package REPLHW;

public class Repl136 {
String schoolName;
int batch;
int year;
String lastDay;

void display() {
	System.out.println(schoolName+" "+batch+" "+year+" "+lastDay);
}

Repl136(){

}

Repl136(String schoolName, int batch, int year, String lastDay){
	this.schoolName=schoolName;
	this.lastDay=lastDay;
	this.year=year;
	this.batch=batch;
	
}
	
	public static void main(String[] args) {		
		
		Repl136 obj=new Repl136();
		obj.display();
		
		Repl136 obj1=new Repl136("Syntax",6 ,2020 ,"07/30/2020");
	obj1.display();
		
	}
	
	
}








