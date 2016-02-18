package com.ryan.standard.test3;

import java.util.TreeSet;

public class Number40 {
	
	 public static void main(String[] args) {  
		 TreeSet<Integer> s = new TreeSet<Integer>();
		 TreeSet<Integer> subs = new TreeSet<Integer>();
		 for(int i = 324; i<=328; i++) {
			 s.add(i);
		 } 
		 
		 subs = (TreeSet) s.subSet(326, true, 328, true );
		 subs.add(329); // this is out of range, you canno add more than the subset
		 // since the subset is created using a range (fromElement to toElement), the element that you are inserting must fall within that range
		 System.out.println(s+" "+subs);
	 }
}
