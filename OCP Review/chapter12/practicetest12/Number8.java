package practicetest12;

class A {
	void m() {
		System.out.println("outer");
	}
}

public class Number8 {
	public static void main(String[] args) {
		new Number8().go();
	}
	
	void go() {
		new A().m();
		class A {
			void m() {
				System.out.println("inner");
			}
		}
	}
	
	class A {
		void m() {
			System.out.println("middle");
		}
	}
}
