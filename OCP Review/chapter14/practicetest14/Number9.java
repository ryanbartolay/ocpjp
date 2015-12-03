package practicetest14;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Number9 {
	public static void main(String[] args) {
		ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
		//rwl.readLock().lock();
		//rwl.readLock().unlock(); // throws IlleegalMonitorStateException because it not locked
		System.out.println("Read UNLOCK");
		rwl.readLock().lock();
		System.out.println("Read LOCK1");
		rwl.readLock().lock();
		System.out.println("Read LOCK2");
		
		rwl.readLock().unlock();
		System.out.println("Read UNLOCK2");
		
		rwl.writeLock().lock(); // when write unlock it is blocked and waiting
		System.out.println("Write LOCK");
		rwl.writeLock().lock();
		System.out.println("Write LOCK2");
		rwl.writeLock().unlock();
		System.out.println("Write UNLOCK2");
		rwl.writeLock().unlock();
		
	}
}
