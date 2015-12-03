package practicetest12;

public class Number10 {
	class InnerClass {
		void doStuff() throws Exception {
			System.out.println("x ");
		}
	}
	
	class InnerClass2 extends InnerClass {
		@Override
		void doStuff() throws Exception { }
	}
	
	public static void main(String[] args) throws Exception {
		new Number10().go();
	}

	private void go() throws Exception {
		new InnerClass2().doStuff();
	}
}
