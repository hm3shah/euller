package threads;

import java.util.concurrent.Semaphore;

public class TestingSemaphore {
	Semaphore sem1, sem2;

	public TestingSemaphore() {
		sem1 = new Semaphore(1);
		sem2 = new Semaphore(1);

		try {
			sem1.acquire();
			sem2.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void temp() {
		sem1.release();
		System.out.println("Done");
	}
	
	public static void main(String[] args) {
		final TestingSemaphore testingSemaphore = new TestingSemaphore();
		
		Thread thread = new Thread( new Runnable() {
	
			@Override
			public void run() {
				testingSemaphore.temp();
			}
		});
		thread.start();
	}

}
