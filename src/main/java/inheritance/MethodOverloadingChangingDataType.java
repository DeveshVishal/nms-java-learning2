package inheritance;

public class MethodOverloadingChangingDataType {

	public static void main(String[] args) {
		
		Adder2 obj = new Adder2();
		
		System.out.println(obj.add(10.10f, 10.10f));
		System.out.println(obj.add(10, 10));
		
		Multiply m = new Multiply();
		
		m.mul(36,36);

	}

}
