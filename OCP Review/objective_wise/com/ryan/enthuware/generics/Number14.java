package com.ryan.enthuware.generics;

import java.util.*;

public class Number14 {

	private String name;
	
	public Number14(String name){
		this.name = name;
	}
	
	public String getName() { 
		return this.name;
	}
	
	public void setName(String name) { 
		this.name = name; 
	}
	
	public String toString() { 
		return name; 
		 
	}   
	
	public static void main(String[] args) { 
		Queue<Number14> q = new LinkedList<Number14>();
		q.offer(new Number14("Pope"));
		q.offer(new Number14("John")); 
		Queue<Number14> helpedQ = new LinkedList<Number14>(); 
		Helper h = new Helper();
		h.helpPeople(q, helpedQ);
	}
}

class Helper {
	public void helpPeople(Queue people, Queue helped) { // warning here : legacy type of queue
		do { 
			Number14 p = (Number14) people.poll(); 
			System.out.println("Helped : " + p + " ");
			helped.offer(p.getName()); // warning here : legacy type of queue
		} while (!people.isEmpty());
	}  
	

}