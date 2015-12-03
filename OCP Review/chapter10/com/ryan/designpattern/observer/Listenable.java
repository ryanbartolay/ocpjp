package com.ryan.designpattern.observer;

public interface Listenable<E> {
	void addChangeListener(E e);
}
