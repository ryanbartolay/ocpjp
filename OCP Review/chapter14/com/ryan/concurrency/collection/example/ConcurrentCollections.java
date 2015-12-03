package com.ryan.concurrency.collection.example;

import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentCollections {
	public static void main(String[] args) {
		ConcurrentMap<String, String> cMap 	= new ConcurrentHashMap<>();
		ConcurrentMap<String, String> cMap2 = new ConcurrentSkipListMap<>();
		ConcurrentMap<String, String> cMap3 = new ConcurrentSkipListMap<>(
				new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return 0;
					}			
				});

		ConcurrentSkipListSet<String> cSet 	= new ConcurrentSkipListSet<>();
		ConcurrentSkipListSet<String> cSet1 = new ConcurrentSkipListSet<>(
				new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return 0;
					}			
				});


		System.out.println(cMap);
		System.out.println(cMap2);

		System.out.println(cSet1);
	}
}
