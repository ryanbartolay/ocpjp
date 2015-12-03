package com.ryan.innerclass;

class PopIllegal {
	public void pop() {
		System.out.println("POP super");
	}
}

public class AnonymousInnerClassIllegal {
	private static PopIllegal p2 = new PopIllegal();
	private static PopIllegal p = new PopIllegal() {

		@Override
		public void pop() {
			System.out.println("POP anonymous");
		}
		
		public void pop2() {
			System.out.println("POP anonymous 2");
		}
	};

	public static void main(String[] args) {
		p2.pop();
		p.pop();
		// p.pop2(); // this is the illegal part, compiler cannot see this as the reference variable type doesnt declare this
		// polymorphism is applied here
	}
}
