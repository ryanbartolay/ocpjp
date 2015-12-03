package com.ryan.designpattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class ListenableModel implements Listenable<PropertyChangeListener> {
	protected static final String FIRSTNAME = "FIRSTNAME";
	protected static final String LASTNAME = "LASTNAME";
	private List<PropertyChangeListener> listeners = new ArrayList<PropertyChangeListener>();
	
	protected void notifyChange(String propertyName, String oldValue, String newValue) {
		for(PropertyChangeListener listener : listeners) {
			listener.propertyChange(new PropertyChangeEvent(this, propertyName, oldValue, newValue));
		}
	}
	
	@Override
	public void addChangeListener(PropertyChangeListener e) {
		listeners.add(e);
	}
}
