package practicetest13;

public class Number3 {
	public static void main(String[] args) {
		printAll(args);
	}

	private static void printAll(String[] args) {
		for (int i = 0; i < args.length; i++) {
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // must be enclose in try catch
		}
	}
}
