package com.ryan.standard.test3;

public class Number40 {
	
		 ����public static void main(String[] args) {  ��������TreeSet<Integer> s = new TreeSet<Integer>(); ��������TreeSet<Integer> subs = new TreeSet<Integer>();  ��������for(int i = 324; i<=328; i++) ��������{ ������������s.add(i); ��������} ��������subs = (TreeSet) s.subSet(326, true, 328, true ); ��������subs.add(329); ��������System.out.println(s+" "+subs); �������� ����}
	
}
