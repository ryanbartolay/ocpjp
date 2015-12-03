package practicetest13;

public class Number9 {
	
	public static void main(String[] args) {
		Thread t = new Thread();
		
		try {
			main2(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * if not declared as synchronized (t) 
	 * output would be 
	 * X
	 * Exception in thread "main" java.lang.IllegalMonitorStateException
	 * 	at java.lang.Object.wait(Native Method)
	 * 	at practicetest13.Number9.main(Number9.java:8)
	 */
	public static synchronized void main2(Thread t) throws InterruptedException {
		synchronized (t) {
			t.start();
			System.out.println("X");
			t.wait(100000);
			System.out.println("Y");
		}
		
	}
}
