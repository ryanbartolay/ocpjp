package com.ryan.enthuware.advanceoop;

public class Number15 {
	enum Card {
		HEART, SPADE, DIAMOD, FLOWER
	}
	
	public static void main(String[] args) {
		for (Card card : Card.values()) { // enum has values method
			System.out.println(card);
		}
	}
}
