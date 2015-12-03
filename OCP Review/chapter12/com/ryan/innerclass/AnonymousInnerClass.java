package com.ryan.innerclass;

class Pop {
	public void pop() {
		System.out.println("POP class");
	}
}

public class AnonymousInnerClass {
	public void setUpAnonymous() {
		new PopIllegal().pop();
		
		PopIllegal pop = new PopIllegal() {
			@Override
			public void pop() {
				System.out.println("Pop Anonymous");
			}
		};
		
		pop.pop();
		
	}
	
	public static void main(String[] args) {
		new AnonymousInnerClass().setUpAnonymous();
	}
}
