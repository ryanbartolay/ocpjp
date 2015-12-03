package practicetest7;

import java.io.IOException;

/**
 * this class will throw IOException with suppressed RuntimeException a
 * 
 * @author ryan.bartolay
 *
 */
public class Number11 {
	class Lamb implements AutoCloseable {
		@Override
		public void close() throws Exception {
			throw new RuntimeException("a");
		}
	}
	
	public static void main(String[] args) throws Exception {
		new Number11().run();
	}
	
	private void run() throws Exception {
		try(Lamb l = new Lamb();) {
			throw new IOException();
		} catch (Exception e) {
			throw e;
		}
	}
}