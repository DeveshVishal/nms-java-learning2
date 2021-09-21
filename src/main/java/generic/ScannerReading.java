package generic;

import java.io.*;
import java.util.*;

public class ScannerReading {

	public static void main(String[] args) throws FileNotFoundException{
		
		String filename = "/Users/deveshvishal/Downloads/f1.txt";
		
		File txtFile = new File(filename);
		
		Scanner in  = new Scanner(txtFile);
		
		int val = in.nextInt();
		
		System.out.println(val);
		
		in.nextLine();
		
		while(in.hasNext()) {
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
	}

}
