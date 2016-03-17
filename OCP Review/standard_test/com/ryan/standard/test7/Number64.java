package com.ryan.standard.test7;

public class Number64 {
	public static void main(String[] args) {
		SpecialPicker<Integer> sp = new SpecialPicker<>(); //1   
		System.out.println(sp.pickOne(1, 2).intValue()+1); //2
	}
}

class SpecialPicker<K> {
	public K pickOne(K k1, K k2) {
		
		System.out.println("k1.hashCode() " + k1.hashCode()); // hashcode is 1
		System.out.println("k2.hashCode() " + k2.hashCode()); // hashcode is 2
		return k1.hashCode() > k2.hashCode() ? k1 : k2;
	}
}
