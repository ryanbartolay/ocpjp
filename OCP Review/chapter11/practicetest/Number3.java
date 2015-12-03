package practicetest;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Number3 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("2");
		set.add(Integer.toString(3));
		set.add("1");
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		
	}
}
