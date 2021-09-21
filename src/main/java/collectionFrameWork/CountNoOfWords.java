package collectionFrameWork;

import java.util.HashMap;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		HashMap<String,Integer> mp = new HashMap<>();
		
		String s = "Java is a program language , it is a platform independent language";
		
		String words[] = s.split(" ");
		
		for(String word : words) {
			
			Integer integer = mp.get(word);
			  
            if (integer == null)
                mp.put(word, 1);
  
            else {
                mp.put(word, integer + 1);
            }
        }
		
		System.out.println("No. of words is " + mp.size());
        System.out.println(mp);

	}

}
