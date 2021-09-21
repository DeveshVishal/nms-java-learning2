package inheritance;

class A {
	
	A() {
		System.out.println("Parent constructor");
	}
	
	void print() {
		System.out.println("Class A");
	}
}

class B extends A {
	
	B() {
		super();
		System.out.println("class B constructor");
		
	}
	
	void print() {
		System.out.println("Class B");
		super.print();
	}
	
	
	
}
public class Super2 {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.print();

	}

}
