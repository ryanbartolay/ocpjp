package practicetest13;

public class Number12 {
	static Thread laurel, hardy;
	public static void main(String[] args) {
		laurel = new Thread() {

			@Override
			public void run() {
				System.out.println("A");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("B");
				}
				System.out.println("C");
			}

		};
		
		hardy = new Thread() {
			@Override
			public void run() {
				System.out.println("D");
				try {
					laurel.wait();
				} catch (Exception e) {
					System.out.println("E");
				}
				System.out.println("F");
			}
		};
		
		laurel.start();
		hardy.start();
	}
}
