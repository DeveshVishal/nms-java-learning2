package threads;

class Q {
	
	int num;
	boolean valueset = false;
	
	public synchronized void put(int num) {
		
		while(valueset) {
			try {
				wait();
			}
			catch(Exception e) {}
		}
			
		System.out.println("Put : " + num);
		valueset = true;
		this.num = num;
		notify();
		
	}
	
	public synchronized void get() {
		
		while(!valueset) {
			try {
				wait();
			}
			catch(Exception e) {}
		}
			
		System.out.println("Get : " + num);
		valueset = false;
		notify();

	}
}

class Producer implements Runnable {
	
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	
	int i = 0;
	public void run() {
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {}
		}
	}
}

class Consumer implements Runnable {
	
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	
	int i = 0;
	public void run() {
		while(true) {
			q.get();
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {}
		}
	}
}
public class WaitNotify {

	public static void main(String[] args) {
		
		Q p = new Q();
		
		new Producer(p);
		new Consumer(p);

	}

}
