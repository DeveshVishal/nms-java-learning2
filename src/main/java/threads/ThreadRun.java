package threads;

class MyTask extends Thread {
	
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("@@ Printer " + i + " is Running");
		}
		
	}
}
public class ThreadRun {

	public static void main(String[] args) {
			
		MyTask task = new MyTask();
		
		task.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println(" ^^ Printer " + i + " is Running");
		};
		
	}

}
