package com.ryan.standard.test1;

public class Number35 extends Thread { 
	static int x, y;
	
	public static synchronized void setX(int i) { 
		x++; 
	} 
	
	public static synchronized void setY(int j) {
		y++; 
	} 
	
	public void setXY(int i, int j) { 
		setX(i); 
		setY(j); 
	} 
	
	public boolean testXY() { 
		return x != y;
	}
	
	public void run(){
		setXY(1, 2); 
		System.out.println(testXY()); 
	} 
	
	public static void main(String[] args) {
		new Number35().start(); 
		new Number35().start(); 
	} 
}