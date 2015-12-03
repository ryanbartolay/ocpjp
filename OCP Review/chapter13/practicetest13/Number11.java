package practicetest13;

public class Number11 {
	synchronized void a() { actBusy(); }
	static synchronized void b() { actBusy(); }
	static void actBusy() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		final Number11 x = new Number11();
		final Number11 y = new Number11();

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int option = (int) (Math.random() * 4);
				switch(option) {
				case 0: x.a(); break;
				case 2: Number11.b(); break;
				case 3: y.a(); break;
				case 4: Number11.b(); break;
				}
			}
		};
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
	}
}

