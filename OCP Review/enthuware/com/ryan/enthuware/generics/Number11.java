package com.ryan.enthuware.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Number11 {
	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<>();
		maps.put("ryan", "123");
		maps.put("ryan", "5555");
		maps.put("ryan", "33333");
		maps.put("ryan", "2222");
		for(Entry<String, String> entry : maps.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
