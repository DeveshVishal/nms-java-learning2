package inheritance;

class D {
	
	final void print() {
		System.out.println("final Class D");
	}
}

public class FinalInheritClass extends D {
	
	//Final class can't override
	void print() {
		System.out.println("FinalInheritClass");
	}
	
	public static void main(String[] args) {
		
		FinalInheritClass fic = new FinalInheritClass();
		
		fic.print();

	}

}
