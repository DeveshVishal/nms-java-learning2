package inheritance;

class AA {
	
	String s = "Class A";
}

class BB extends AA{
	
	String s = "Class B";
	
	void print() {
		
		System.out.println(s);
		System.out.println(super.s);
	}
}

public class Super {

	public static void main(String[] args) {
		
		BB b = new BB();
		
		b.print();
	}

}
