package com.ryan.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndPolymorphism {
	public static void main(String[] args) {
		// generic type of reference = generic type of object
		// List<Parent> parents = new ArrayList<Child>(); // wrong, generics type must be the same with the instance 
		List<Parent> parents = new ArrayList<Parent>();
		parents.add(new Child());
		
		List<Child> children = new ArrayList<Child>();		
		
		//parseParents((List<Parent>) new Child());
		//parseParents(children); // error, should be List<Parent>  
	}
	
	private static final void parseParents(List<Parent> parents) {
		parents.add(new Child2());		
	}
}

abstract class Parent {
	abstract boolean checker();
}

class Child extends Parent {

	@Override
	boolean checker() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class Child2 extends Parent {

	@Override
	boolean checker() {
		// TODO Auto-generated method stub
		return false;
	}
	
}