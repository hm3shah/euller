package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestingLock {

	Lock lock1;
	Lock lock2;

	public TestingLock() {
		lock1 = new ReentrantLock();
		lock2 = new ReentrantLock();

		lock1.lock();
		lock2.lock();
	}

	public void temp1() {
		lock1.unlock();
		System.out.println("Done");
		lock1.lock();
	}

	public static void main(String[] args) {
		final TestingLock testingLockAndSemaphore = new TestingLock();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

				testingLockAndSemaphore.temp1();
			}

		});
		thread.start();
	}

}
