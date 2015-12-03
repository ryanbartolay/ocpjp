package practicetest7;

import java.io.IOException;

/**
 * THis code will throw runtime exception c without suppressed exception
 * because exception from runtime A and IOException were already caught
 * in the try catch block, and then the code throws a separate runtime exception c.
 * @author ryan.bartolay
 *
 */
public class Number10 {
	class Lamb implements AutoCloseable {

		@Override
		public void close() throws Exception {
			throw new RuntimeException("a");
		}
		
	}
	public static void main(String[] args) throws Exception {
		new Number10().run();
	}
	
	private void run() throws Exception {
		try(Lamb l = new Lamb();) {
			throw new IOException();
		} catch (RuntimeException e) {
			System.out.println("123");
		} catch (Exception e) {
			//throw e;
			// if you uncomment throw e, this code will throw
			// IOException with suppressed runtime A
			throw new RuntimeException("c");
		}
	}
}
