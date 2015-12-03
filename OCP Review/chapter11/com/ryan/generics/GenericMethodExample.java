package com.ryan.generics;

import com.ryan.design.Bus;
import com.ryan.design.Car;
import com.ryan.design.Vehicle;

public class GenericMethodExample {
	public static void main(String[] args) {
		MethodExample<Bus, Car, Car> me = new MethodExample<>();
		
		MethodExample2<MethodExample2> l = new MethodExample2<>();
	}
} 

class MethodExample <T, X, A extends Vehicle> {
	
	private T varT;
	
	public void methodX(X varX) {
		
	}
	
	public A methodReturnA(A a) {
		a.run(); // from Vehicle super class
		return null;
	}
	
	void X(){
		
	}
}

class MethodExample2 <MethodExample2> {
	public MethodExample2 getInstance() {
		return null;
	}
}