package com.ryan.usingcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.ryan.model.User;

public class UsingSet {
	public static void main(String[] args) {
		Set<User> users = new TreeSet<>(); // TreeSet must be mutually compatible
		// This two will add up if you didnt override the hashcode / equals
		users.add(new User(10, "Ryan")); // will not add because of duplication
		users.add(new User(10, "Ryan"));
		
		users.add(new User(2, "Joaquin"));
		users.add(new User(35, "Alejandro"));
				
		System.out.println(users);
		
		Iterator<User> iter = users.iterator();
		
		while (iter.hasNext()) {
			User user = iter.next();
			System.out.println(user);
		}
		
		System.out.println(users.contains(new User(2)));
		System.out.println(users.contains(new User(21)));
		
		System.out.println(users.size());
		System.out.println(users.isEmpty());
		System.out.println(users.remove(new User(2)));
		System.out.println(users);
		
	}
}
