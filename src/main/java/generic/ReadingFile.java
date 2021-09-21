package generic;

import java.io.*;

public class ReadingFile {

	public static void main(String[] args) {
		
		File file = new File("f1.txtt");
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			
			br = new BufferedReader(fr);
			
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch (IOException e) {
			System.out.println("unable to read File");
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Can't close file");
			} catch(NullPointerException e) {
//				System.out.println("Can't close file");
			}
		}
		

	}

}
