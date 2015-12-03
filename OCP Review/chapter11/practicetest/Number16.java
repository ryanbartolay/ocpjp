package practicetest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Number16 {
	public static void main(String[] args) {
		String[] s = {"map", "pen", "marble", "key"};
		OthelloComparator o = new OthelloComparator();
		
		Arrays.sort(s, o);		
		
		for(String x : s) {
			System.out.println(x);	
		}
		
		System.out.println(Arrays.binarySearch(s, "key")); // will output undetermined output
		System.out.println(Arrays.binarySearch(s, "key", o)); // will return the exact element index
		
		TreeSet<String> a = new TreeSet<>();
		
		for(String x : s) {
			a.add(x);	
		}
		
		Iterator<String> xx = a.iterator();
		while(xx.hasNext()) {
			System.out.println(xx.next());
		}
		///Collections.sort(a);
	}
	
	static class OthelloComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	}
}
