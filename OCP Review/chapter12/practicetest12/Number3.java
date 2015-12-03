package practicetest12;

class OuterNumber3 {
	
}

interface InterfaceNumber3 {
	
}

interface InterfaceNumber3a {
	
}

public class Number3 {
	private int num = 2;
	
	// Which is true about method-local inner classes
	void go() {
		
		// 1. You can declare it as an abstract
		abstract class MethodLocal {
			void go2() {
				System.out.println(num);
			}
		}
		// 2. You can declare multiple in a method
		class MethodLocal2 extends OuterNumber3 implements InterfaceNumber3 {
			// 3. can extend outside class 
		}
		
		// 4. can be marked as final
		final class MethodLocal3 {
			
		}
		
		// 5. It cannot be marked as public		
		//public class MethodLocal4 {}
		
		// 6. cannot be marked as static
		// static class MethodLocal5 {}
		
		// 7. can implement interface
		class MethodLocal6 implements InterfaceNumber3, InterfaceNumber3a { }
		
		// 8. can extend class and implement interface
		class MethodLocal7 extends OuterNumber3 implements InterfaceNumber3, InterfaceNumber3a { }
		
		class MethodLocal8 extends MethodLocal { }
	}
}
