package practicetest14;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Number2 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> intList = new CopyOnWriteArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		Iterator<Integer> i = intList.iterator();
		intList.remove(2);
		Iterator<Integer> n = intList.iterator();
		
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
	}
}
