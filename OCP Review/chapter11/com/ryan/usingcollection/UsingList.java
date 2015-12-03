package com.ryan.usingcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ryan.model.User;

public class UsingList {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();		
		users.add(new User(10, "Ryan"));
		users.add(new User(2, "Joaquin"));
		users.add(new User(35, "Alejandro"));		
		
		Iterator<User> iter = users.iterator();
		
		while(iter.hasNext()) {
			User user = iter.next();
			System.out.println(user);
		}
		
		
		System.out.println(users.contains(new User(3))); // returns true because of the hashcode / equals
		System.out.println(users.contains(new User(20)));
		
		
		System.out.println(users.get(2)); // List index starts at 0
		
		System.out.println(users.indexOf(new User(2))); // returns 1 because index starts at 0
		
	}
}
