package practicetest14;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Number3 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> intList = new CopyOnWriteArrayList<>();
		intList.add(1); // create a copy
		intList.remove(2); // create a copy
		Iterator<Integer> n = intList.iterator(); // DOESNT create a copy
		System.out.println(intList.get(0)); // DOESNT create a copy
	}
}
