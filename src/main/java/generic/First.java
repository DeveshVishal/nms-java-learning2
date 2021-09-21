package generic;

import java.util.*;

public class First {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(1);
		a.add("2");
		
//		for(Object i : a) {
//			System.out.println(i);
//		}
		
		printt(a);
	}
	
	public static void printt(ArrayList<?> list) {
		
		for(Object i : list) {
			System.out.println(i);
		}
		
	}
}
