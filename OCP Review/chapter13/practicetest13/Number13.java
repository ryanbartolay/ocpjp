package practicetest13;

public class Number13 implements Runnable {
	@Override
	public void run() {
		go(Thread.currentThread().getId());
	}

	private void go(long id) {
		System.out.println(" " + id);
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId() + " ");
		
		
		//new Number13().start();
		new Thread(new Number13());
		
		// both of the ff produces the same output
		new Number13().run();
		new Thread(new Number13()).run();
		// -------------------------------------
		
		new Thread(new Number13()).start(); 
	}
}
