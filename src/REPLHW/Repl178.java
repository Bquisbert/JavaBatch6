package REPLHW;

import java.util.ArrayList;

public class Repl178 {

//	Create a array list that will hold Integer Objects:
//		Add below elements to it. 
//		111
//		222
//		333
//		444
//		555
//		666
//
//		Print first, third and fifth element from your array
//
//		Expected Output:
//		111
//		333
//		555
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> Nums=new ArrayList<>();
		
		Nums.add(111);
		Nums.add(222);
		Nums.add(333);
		Nums.add(444);
		Nums.add(555);
		Nums.add(666);
		
	
		for(int i=0;i<Nums.size();i+=2) {
			System.out.println(Nums.get(i));
		}
		
		
		
		
	}

}
