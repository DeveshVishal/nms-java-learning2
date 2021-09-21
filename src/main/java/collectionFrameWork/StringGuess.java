package collectionFrameWork;

import java.util.Scanner;

public class StringGuess {

	public static void main(String[] args) {
		
		int point  = 0;
		
		Scanner in = new Scanner(System.in);
		
		String shuffle[] = { "fferbu" , "loaft" , "ritsng" } ;
		
		String answer[] = {	"buffer" , "float" , "string" } ;
		
		for(int i = 0; i<shuffle.length; i++) {
			
			System.out.println(shuffle[i]);
			
			System.out.println("Arrange this shuffle String");
			
			String s = in.next();
			
			if(s.equalsIgnoreCase(answer[i])) {
				point++;
				System.out.println("Correct");
			}
			else {
				System.out.println("wrong answer");
			}
		}
		
		System.out.println("Toatal score : " + point);

	}

}
