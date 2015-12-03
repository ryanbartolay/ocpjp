package practicetest;

import java.util.TreeSet;

public class Number10 {
	public static void main(String[] args) {
		Object o = new Object();
		
		// 3 implementation will compile
		// TreeSet will throw an Exception if you iterate, it will lookup the element if it implements comparable
		// TreeSet elements must implement Comparable 
		
		//Set s = new HashSet();
		TreeSet s = new TreeSet();
		//LinkedHashSet s = new LinkedHashSet();
		
		s.add("o");
		s.add(o);
		s.add("o");
		
		for(Object x : s) {
			System.out.println(x);
		}
	}
}
