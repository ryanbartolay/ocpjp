package com.ryan.thread.interaction;

import java.util.ArrayList;
import java.util.List;

public class WaitLooping extends Thread{
	private Machine machine = new Machine();
	@Override
	public void run() {
		MachineInstructions machineInstructions = getMachineInstructionsFromShape(getShapeFromUser());
		machine.addJob(machineInstructions);
	}

	public Shape getShapeFromUser() {
		return new Shape();
	}
	public MachineInstructions getMachineInstructionsFromShape(Shape shape) {
		return new MachineInstructions();
	}
}

class Machine extends Thread {
	List<MachineInstructions> jobs = new ArrayList<>();
	@Override
	public void run() {
		while(true) {
			synchronized (jobs) {
				while(jobs.isEmpty()) {
					try {
						jobs.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void addJob(MachineInstructions machineInstructions) {
		synchronized (jobs) {
			jobs.add(machineInstructions);
			jobs.notify();
		}
	}

}

class Shape {

}

class MachineInstructions {

}