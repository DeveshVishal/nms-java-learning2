package generic;

import java.io.*;

public class Serialization {

	public static void main(String[] args) {
		
		try { 
			Student s1 =new Student(11903817,"Devesh"); 
			
			FileOutputStream fout = new FileOutputStream("f.txt");    
			ObjectOutputStream out = new ObjectOutputStream(fout);    
			out.writeObject(s1);    
			out.flush();      
			out.close();    
			System.out.println("success");    
		}
		catch(Exception e){
			System.out.println(e);
		} 		   
				    
	}

}
