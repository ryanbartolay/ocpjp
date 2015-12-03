package practicetest13;

public class Number1 implements Runnable {
	public static void main(String[] args) {
		Runnable target = new Number1();
		Thread myThread = new Thread(target);
		myThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
