package com.ryan.innerclass;

interface Cookable {
	void cook();
}

class Fruits {
	public void apple(Cookable cook) {
		cook.cook();
	}
}

public class AnonymousInnerClassAsArgument {
	public static void main(String[] args) {
		new Fruits().apple(new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("Im cooking!!!");
			}
		});
	}
}
