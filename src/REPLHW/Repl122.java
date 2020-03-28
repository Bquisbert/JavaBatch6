package REPLHW;

public class Repl122 {

	static int count = 0;

	Repl122() {
		count++;
	}
	

	public static int count() {
		return count;

	}

	public static void main(String[] args) {

		Repl122 obj = new Repl122();
		int num = obj.count();
		

		Repl122 obj2 = new Repl122();
		int num2 = obj2.count();
		
		Repl122 obj3 = new Repl122();
		int num3 = obj3.count();
		System.out.println(num3);

	}

}
