package practicetest13;

public class Number17 implements Runnable {

	@Override
	public void run() {
		move(Thread.currentThread().getId());
	}
	
	static void move(long id) {
		System.out.print(id + " ");
		System.out.print(id + " ");
	}
	
	public static void main(String[] args) {
		Number17 n = new Number17();
		new Thread(n).start();
		new Thread(new Number17()).start();
	}
}
