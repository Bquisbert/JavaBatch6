package REPLHW;

public class Repl130 {

	private void mth1() {
		System.out.println("This is Private Method");
	}
	  void mth2() {
		 System.out.println("This is Default Method");
	 }
	
	  
	protected void mth3() {
		System.out.println("This is Protected Method");
	}
	
	public void mth4() {
		System.out.println("This is Public Method");
	}
	
	
	public static void main(String[] args) {
		
Repl130 obj=new Repl130();


obj.mth1();
obj.mth2();
obj.mth3();
obj.mth4();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
