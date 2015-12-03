package practicetest7;

/**
 * this will output -t1c23
 * @author ryan.bartolay
 *
 * if going out of try block, it will invoke autoclosable.close() method
 */
public class Number7 {
	
	static String s = "-";
	
	class Whistle implements AutoCloseable {

		public void toot() {
			s += "t";
		}
		
		@Override
		public void close() throws Exception {
			s += "c"; // 5 invoke close before going out of try block
		}
	}
	
	public static void main(String[] args) {
		new Number7().run(); // 1. invoke method run
		System.out.println(s);
	}
	
	public void run() {
		try(Whistle w = new Whistle()) {
			w.toot(); // 2 invoke toot
			s += "1"; // 3 concat string 
			throw new Exception(); // 4 throw out of try block
		} catch (Exception e) {
			s += "2"; // 6 concat string
		} finally {
			s += "3";
		}
	}
}