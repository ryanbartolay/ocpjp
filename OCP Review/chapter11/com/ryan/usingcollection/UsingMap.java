package com.ryan.usingcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ryan.model.User;

public class UsingMap {
	enum SampleEnum {
		HEAD, BODY, FOOTER
	}
	public static void main(String[] args) {
		Map<String, Object> mapSample = new HashMap<>();
		mapSample.put("k1", SampleEnum.BODY);
		mapSample.put("k2", new User(1));
		mapSample.put("k3", 23);
		mapSample.put("k3", 3); // this will not insert as key is the same
				
		for(Entry<String, Object> entry : mapSample.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().getClass());
		}
		
		System.out.println(mapSample.get("k4"));
		System.out.println(mapSample.get("k2"));
		System.out.println(mapSample.get(1));
		
		
		System.out.println(mapSample.containsKey("k3"));
		System.out.println(mapSample.containsKey(true));
		
		Map<String, Integer> mapSample2 = new HashMap<>();
		mapSample2.put("k1", 2); // overrided by k1 below
		mapSample2.put("k1", 20); // overrides the value of the exisiting k1 key
		mapSample2.put("k4", 133);
		mapSample2.put("k23", 133);
		
		System.out.println(mapSample2);
	}
}