package practicetest;

import java.util.TreeSet;

class Dog implements Comparable<Dog> { 
	int size;
	Dog(int s) {
		size = s;
	}

	@Override
	public int compareTo(Dog o) {
		if(this.size > o.size) {
			return 1;
		} else if (this.size < o.size) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class Number15 {
	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<>();
		TreeSet<Dog> d = new TreeSet<Dog>(); // This will throw an exception, in case you did not implement Comparable to Dog
		// as treeset always do sorting on assignment.

		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));

		i.add(new Integer(1));
		i.add(2);
		i.add(1);

		System.out.println(i.size() + " " + d.size());
	}
}
