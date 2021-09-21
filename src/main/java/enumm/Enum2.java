package enumm;

enum Days {
	
	sunday,monday,tuesday,wednesday,thrusday,friday,saturday;
	
}

public class Enum2 {
	
	Days day;
	
	Enum2(Days day) {
		this.day = day;
	}
	
	void print() {
		
		switch(day) {
			
		case sunday		: System.out.println("Sunday"); break;
		case monday 	: System.out.println("Monday"); break;
		case tuesday	: System.out.println("Tuesday"); break;
		case wednesday 	: System.out.println("Wednesday"); break;
		case thrusday 	: System.out.println("Thrusday"); break;
		case friday 	: System.out.println("Friday"); break;
		case saturday 	: System.out.println("Saturday"); break;
			
		default 		: System.out.println("Holiday"); break;
		}
	}
	public static void main(String[] args) {
		
		String s = "monday";
		Enum2 e = new Enum2(Days.valueOf(s));
		
		e.print();
		
		Days d[] = Days.values();
		
		for(Days i: d) {
			System.out.println(i + " at index " + i.ordinal());
		}
		
		
	}

}
