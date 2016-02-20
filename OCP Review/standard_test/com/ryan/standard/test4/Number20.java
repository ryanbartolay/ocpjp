package com.ryan.standard.test4;

import java.util.*; 

class Person implements Comparable<Person> { 
	private static int count = 0;
	private String id = "0"; 
	private String interest;
	
	public Person(String interest){ 
		this.interest = interest; 
		this.id = "" + ++count; 
	} 
	public String getInterest(){ 
		return interest;
	}
	
	public void setInterest(String interest){ 
		this.interest = interest; 
	}
	
	public String toString(){ 
		return id; 
	}
	@Override
	public int compareTo(Person o) {
		return this.interest.compareTo(o.interest);
	} 
}

public class Number20 {
	String name = "MATH";
	TreeSet<Person> set = new TreeSet<Person>();

	public void add(Person p) {
		//if(name.equals(p.getInterest())) 
			set.add(p); // without comparable (compareTo) the implementation will throw ClassCastException
	}
	
	public static void main(String[] args) {
		Number20 mathGroup = new Number20();
		mathGroup.add(new Person("MATH")); 
		System.out.println("A");
		mathGroup.add(new Person("MATH2"));
		System.out.println("B");
		
		for(Person p : mathGroup.set) {
			System.out.println(p.getInterest());
		}
		System.out.println(mathGroup);
	}
}