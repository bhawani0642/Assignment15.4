/*
 * Created a class Consumer it implements Runnable interface
 */
public class Consumer implements Runnable {
A a;//created object of A

public Consumer(A a) {
	this.a = a;
	//Creating the object of Thread
	Thread t= new Thread(this,"Consumer");
	//calling the start method
	t.start();
}
//run method
@Override
public void run() {
	while(true){
		a.get();// calling the get method
		try {
			Thread.sleep(1000);// putting the thread on sleep
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


}
