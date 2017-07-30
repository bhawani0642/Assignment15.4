
public class A {
	// Declaring a variable of type integer
	int num;
	//variable of type boolean
	boolean valueSet = false;

	// put method it basically put the value as we are using notify it must be synchronized

	synchronized public void put(int num) {
		//Applying the while loop if valueSet equals to true it waits otherwise it sets the value
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		valueSet = true;
		//To notify the Consumer thread
		notify();
		System.out.println("put : " + num);
		this.num=num;

	}

	// get method it basically put the value as we are using notify it must be synchronized
	synchronized public void get() {
		//Applying the while loop if valueSet is not set it waits otherwise it prints the message and set 
		//otherwise it prints the message and set the value=false
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Get :" + num);
		//To notify the Producer thread
		valueSet = false;
		notify();
	}
}
