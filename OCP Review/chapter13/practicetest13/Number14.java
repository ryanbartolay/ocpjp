package practicetest13;

public class Number14 implements Runnable {

	@Override
	public void run() {
		System.out.println("r1 ");
		System.out.println("r2 ");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new Number14());
		t.start();
		System.out.println("m1 ");
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("m2 ");
	}

}
