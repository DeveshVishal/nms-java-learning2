package collectionFrameWork;

import javax.swing.JButton;

public class Button {
	
	public static void main( String arg[] ) {
		
		
		JButton button = new JButton() ;
		String name = button.getClass().getName() ;
		
		String s1 = "";
		
		for(int i = 0; i<name.length(); i++) {
			
			if(name.charAt(i) == '.' ) {
				s1 = "";
			}
			else {
				s1 += name.charAt(i);
			}
			
		}
		System.out.println(s1) ;
		
		name = button.getClass().getSuperclass().getName();
		
		for(int i = 0; i<name.length(); i++) {
			
			if(name.charAt(i) == '.' ) {
				s1 = "";
			}
			else {
				s1 += name.charAt(i);
			}
			
		}
		
		System.out.println(s1) ;
	}
	
}
