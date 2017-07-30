/*
 * Created a class producer it implements Runnable interface
 */
public class Producer implements Runnable {
	A a; // created object of A
	// constructor

	public Producer(A a) {
		this.a = a;
		// Creating the object of Thread
		Thread t = new Thread(this, "Producer");
		// calling the start method
		t.start();
	}

	// run method
	@Override
	public void run() {
		int count = 0;
		while (true) {
			a.put(count++);// calling the put method
			try {
				Thread.sleep(1000);// putting the thread on sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
