package com.ryan.standard.test5;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class Number7 extends RecursiveAction {

	@Override
	protected void compute() {
		RecursiveAction action = new Number7();
		action.invoke();
	}
	
}
