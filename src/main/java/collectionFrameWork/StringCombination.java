package collectionFrameWork;

public class StringCombination {
	
	public static void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s + " ");
        	return;
        }
        for (int i = l; i <= r; i++) {
        	s = swap(s,l,i);
            permute(s, l+1, r);
            s = swap(s,l,i);       
        }
    }
	
	public static void main(String[] args) {
		
		String s = "Yellow";
		
		permute(s,0,s.length()-1);
		

	}
	
	public static String swap(String s, int i, int j)
    {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
