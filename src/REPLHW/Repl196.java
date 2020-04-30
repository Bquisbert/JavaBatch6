package REPLHW;

import java.util.HashMap;
import java.util.Map;

public class Repl196 {
//Create a Map in which you do not need to preserve the order of the entries
//	Add below pair to it . 

//	"Street" = "Patrick ST"
//	"Suite" = "265"
//	"City" = "Vienna"
//	"Zip" = "22180"
//	"Country" = "United State"

//	Find how many entries are inside the map
	//Remove all entires from the Map
	//Find the Map size again
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Map<String,String>mm=new HashMap<>();
		mm.put("Street","Patrick");
		mm.put("Suite", "265");
		mm.put("City", "Vienna");
		mm.put("Zip", "22180");
		mm.put("Country", "United State");
	
		System.out.println(mm.size());
		
		mm.clear();
		
		System.out.println(mm.size());

		
	}

}
