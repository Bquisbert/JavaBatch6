package REPLHW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Repl208 {

	public static void main(String[] args) {

		try {
			String filePath=System.getProperty("user.dir")+"\\configs\\Examples.propertie";
			FileInputStream fis=new FileInputStream(filePath);
		}catch(FileNotFoundException fnf) {
			System.out.println(fnf);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
