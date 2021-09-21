package properties;

import java.util.*;

public class Pro2 {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		  
        Set set = p.entrySet();
  
        Iterator itr = set.iterator();
        
        while (itr.hasNext()) {
  
            Map.Entry entry = (Map.Entry)itr.next();
            
            System.out.println(entry.getKey() + " = "+ entry.getValue());
        }

	}

}
