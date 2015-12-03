package practicetest14;

import java.util.concurrent.atomic.AtomicInteger;

public class Number7 {
	public static void main(String[] args) {
		AtomicInteger aInt = new AtomicInteger();
		
		// these are atomic methods
		System.out.println(aInt.addAndGet(9)); 
		System.out.println(aInt.getAndAdd(10));
		System.out.println(aInt.get());
	}
}
