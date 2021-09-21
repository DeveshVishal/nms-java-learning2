package inheritance;

 final class C{
	 
 }  

 // Final class can't extends
public class FinalClass extends C{
	
	void run(){
		System.out.println("FinalClass");
	}  
	public static void main(String[] args) {
		
		FinalClass fc = new FinalClass();
		
		fc.run();

	}

}
