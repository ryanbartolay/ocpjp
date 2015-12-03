package com.ryan.concurrency.executor.example;

import java.util.concurrent.Executor;

public class SameThreadExecutor implements Executor {
	@Override
	public void execute(Runnable command) { 
		command.run();
	}	
}
