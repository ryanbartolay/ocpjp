package practicetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

interface A {
	
}
interface B {
	
}
interface C extends A {
	
}
class Business {
	
}
class Hotel extends Business {
	
}
class Inn extends Hotel {
	
}

public class Number14 {
	
	<E extends Hotel> ArrayList<E> go() {
		return new ArrayList<E>();
	}
	
	ArrayList<Hotel> go2() {
		return new ArrayList<Hotel>();
	}
	
	<T extends Hotel> T go3(T end) {
		return end;
	}
	// Multiple Bounds can only be extended to 1 class and multiple interfaces
	// again unable to extends to multiple classes, because of diamond inheritance
	private <V extends Hotel & A & C & B> Map<String, V> go4() {
		return null;
	}
	
	public static void main(String[] args) {
		Number14 num = new Number14();
		
		List<Inn> e = num.go();
	}
}
