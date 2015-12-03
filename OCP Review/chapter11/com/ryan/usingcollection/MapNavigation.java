package com.ryan.usingcollection;

import java.util.SortedMap;
import java.util.TreeMap;

import com.ryan.model.User;

public class MapNavigation {
	public static void main(String[] args) {
		TreeMap<String, User> users = new TreeMap<>();
		users.put("k1", new User(342, "Ryan"));
		users.put("12", new User(782, "Antonio"));
		users.put("k2", new User(444, "Loyola"));
		users.put("k3", new User(122, "Joaquin"));
		users.put("13", new User(990, "Barata"));
		
		System.out.println(users);
		
		SortedMap map = users.subMap("k1", "k5");
		map.put("k4", new User(666, "Hello World"));
		
		System.out.println(users);
		System.out.println(map);
		
		map.remove("k4");
		
		System.out.println(users);
		System.out.println(map);
		
		// map.put("p", "Hello World"); // error out of range // cannot add values in sub map
		/*
		System.out.println(users);
		System.out.println(map); // we will still see the new entry*/
		
		System.out.println(users.ceilingKey("k5"));
		System.out.println(users.ceilingEntry("k5"));
		
		System.out.println(users.tailMap("13")); // gets the >= of the key -1
		System.out.println(users.headMap("13")); // gets the <= of the key -1
		
	}
}
