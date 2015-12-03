package practicetest13;


/**
 *  output would be
 *  MyThread
 * 	foo 
 * @author ryan.bartolay
 *
 */
class MyThread extends Thread {
	
	public MyThread() {
		System.out.println("MyThread"); // will still be called in anonymous class
	}

	@Override
	public void run() {
		System.out.println("bar ");
	}
	public void run(String s) {
		System.out.println("baz ");
	}
}

public class Number10 {

	public static void main(String[] args) {
		Thread t = new MyThread() { // even declared as anonymous class, it will still call constructor
			@Override
			public void run() {
				System.out.println("foo ");
			}
		};
		t.start();
	}
}
