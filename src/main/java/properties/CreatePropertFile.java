package properties;

import java.io.*;
import java.util.*;

public class CreatePropertFile {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
        p.setProperty("name", "Devesh Vishal");
        p.setProperty("email", "deveshvishal@gmail.com");
  
        p.store(new FileWriter("p1.properties"),"Netmeds");
        
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("email"));

	}

}
