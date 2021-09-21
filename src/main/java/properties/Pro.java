package properties;

import java.io.*;
import java.util.*;

public class Pro {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("db.properties");
		
        Properties p = new Properties();
        
        p.load(reader);
        
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));

	}

}
