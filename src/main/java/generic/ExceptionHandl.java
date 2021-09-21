package generic;

import java.util.*;
import java.io.*;

public class ExceptionHandl {

	public static void main(String[] args) {
		
		File file = new File("f1.txt");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found " + file.toString());
		}
		
		
		
	}

}
