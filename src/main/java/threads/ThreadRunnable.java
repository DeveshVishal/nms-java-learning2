package threads;

class A {
	
}
class MyTask extends A implements Runnable {
	
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("@@ Printer " + i + " is Running");
		}
		
	}
}
public class ThreadRunnable {

	public static void main(String[] args) {
			
		Runnable r = new MyTask();
		
		Thread task = new Thread(r);
		
		task.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println(" ^^ Printer " + i + " is Running");
		};
		
	}

}
