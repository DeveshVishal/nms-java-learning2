package collectionFrameWork;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		int[] a = new int[25];
	    
	    Random rnd = new Random();
	    
	    int i=0;
	    
	    while(i < a.length) {
	    	
	      int n = rnd.nextInt(26);
	      
	      if(n == 0) continue;
	      boolean flag = true;
	      
	      for(int j=0; j<i; j++) {
	        if(a[j] == n) {
	          flag = false;
	          break;
	        }
	      }
	      
	      if(flag) {
	        a[i++] = n; 
	      }
	    }
	    
	    for(int x : a) {
	      System.out.print(x + " ");
	    }

	}

}