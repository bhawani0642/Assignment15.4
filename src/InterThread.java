
public class InterThread {

	public static void main(String[] args) {
		//Creating the object of class A
		A a= new A();
		// object of Producer
		 new Producer(a);
		// object of Consumer
		 new Consumer(a);
		

	}

}
