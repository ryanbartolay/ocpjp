package com.ryan.innerclass;

interface Jumpable {
	void jump();
}

public class AnonymousInnerClass2 {
	public static void main(String[] args) {
		Jumpable j = new Jumpable() {
			
			@Override
			public void jump() {
				System.out.println("Do Jumping " + jumpCount());
			}
			
			private int jumpCount() {
				return 10;
			}
		};
		
		j.jump();
		
		//System.out.println();
	}
}
