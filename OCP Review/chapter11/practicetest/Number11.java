package practicetest;

import java.util.LinkedHashSet;

class Turtle {
	int size;
	public Turtle(int s) {
		size = s;
	}
	@Override
	public int hashCode() {
		return size / 5;
	}
	@Override
	public boolean equals(Object obj) {
		return this.size == ((Turtle) obj).size;
	}
}
public class Number11 {
	public static void main(String[] args) {
		LinkedHashSet<Turtle> t = new LinkedHashSet<Turtle>();
		t.add(new Turtle(1));
		t.add(new Turtle(2));
		t.add(new Turtle(1));
		System.out.println(t.size()); // 3
	}
}
