package threads;

class Printer {
	
	synchronized void printDocument(int noOfCopies, String name) {
		for(int i = 0; i<noOfCopies; i++) {
			
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Printing " + name +" " + (i+1));
		}
	}
}

class MyThread extends Thread {
	
	Printer pRef;
	
	MyThread(Printer p) {
		pRef = p;
	}

	public void run() {
		pRef.printDocument(10,"Devesh.pdf");
	}
}

class YourThread extends Thread {
	
	Printer pRef;
	
	YourThread(Printer p) {
		pRef = p;
	}

	public void run() {
		pRef.printDocument(10,"Vishal.pdf");
	}
}

public class SeprateThread {

	public static void main(String[] args) {
		
		System.out.println("Application Started");
		
		Printer p = new Printer();
		
		MyThread myt = new MyThread(p);
		YourThread yt = new YourThread(p);
		
		myt.start();
//		try {
//			myt.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		yt.start();
		
		System.out.println("Application Finished");

	}

}
