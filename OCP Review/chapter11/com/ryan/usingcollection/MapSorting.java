package com.ryan.usingcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ryan.model.User;

public class MapSorting {
	public static void main(String[] args) {
		Map<String, User> strings = new HashMap<>();
		strings.put("z", new User(66, "Bartolay"));
		strings.put("a", new User(98, "Ryan"));
		strings.put("d", new User(84, "Kristoffer"));
		strings.put("e", new User(45, "Loyola"));
		
		// Lets convert the Map to list because Collections.sort(); only accepts list as parameter
		List<Entry<String, User>> userList = new ArrayList<>(strings.entrySet());		
		
		System.out.println(userList);
		// Collections.sort(userList); // Entry doesnt implement Comparable // this is error
		Collections.sort(userList, new Comparator<Entry<String, User>>() {
			@Override
			public int compare(Entry<String, User> o1, Entry<String, User> o2) {
				return o1.getKey().compareTo(o2.getKey());				
			}
		});
		
		System.out.println(userList);
		
		Collections.sort(userList, new Comparator<Entry<String, User>>() {
			@Override
			public int compare(Entry<String, User> o1, Entry<String, User> o2) {				
				if(o1.getValue().getId() > o2.getValue().getId()){
					return 1;
				} else if(o1.getValue().getId() < o2.getValue().getId()){
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		System.out.println(userList);
	}
}
