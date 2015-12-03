package practicetest14;

import java.util.concurrent.ArrayBlockingQueue;

public class Number4 {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(10);
		try {
			abq.add(1); // true if can insert, throw exception if not
			abq.offer(2); // true if can insert, return false if not
			
			// this will wait if the queue is full
			abq.put(1); // Inserts the specified element at the tail of this queue, WAITING for space to become available if the queue is full.
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
