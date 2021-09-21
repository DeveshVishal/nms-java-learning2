package collectionFrameWork;

import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float[] valueA = { 10.2f , 14.3f , 16.5f , 
				           18.4f , 22.3f , 36.8f , 
				           45.5f , 60.8f , 85.5f , 94.8f
	        			  } ;
		
		System.out.println("Enter Number to Search Previous Number"); 
		
		float key = in.nextFloat();
		float ans = 0;
		
		for(int i = 0; i<valueA.length; i++) {
			if(valueA[i] < key) {
				ans = valueA[i];
			}
		}
		
		System.out.println(ans);
		
		System.out.println("Enter a Number to Search Nearest Number");
		
		key = in.nextFloat();
		
		ans = Float.MAX_VALUE;
		
		for(int i = 0; i<valueA.length; i++) {
			
			if(Math.abs(key-ans) > Math.abs(key-valueA[i]) ) {
				ans = valueA[i]; 
			}
			
		}
		
		System.out.println(ans);

	}

}
