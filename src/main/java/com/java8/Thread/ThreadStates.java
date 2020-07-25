package com.java8.Thread;

public class ThreadStates {

	public static void main(String args[]) {
		// Creating an instance of Basic Thread
		Thread threadInstance = new Thread(new BasicThread());
		threadInstance.start();
		System.out.println("BasicThread State: " + threadInstance.getState());
		try {
			boolean keepRunning = true;
			int count = 1;
			while (keepRunning) {
				System.out.println( "**** TRY thread => " + Thread.currentThread());
				Thread.sleep(2000);
				System.out.println(count * 2 + " Seconds elapsed - BasicThread State: " + threadInstance.getState());
				count++;
				if (count == 4) {
					// 6 seconds elapsed
					synchronized (threadInstance) {
						threadInstance.notify();
					}
				}
				if (Thread.State.TERMINATED == threadInstance.getState()) {
					keepRunning = false;
				}
			}
		} catch (InterruptedException iException) {
			iException.printStackTrace();
		}

	}
}

//BasicThread.java
 class BasicThread implements Runnable {
	@Override
	public void run() {
		System.out.println( "**** Runn thread => " + Thread.currentThread());
		Thread thread = Thread.currentThread();
		try {
			// Making the thread sleep for 5 seconds
			System.out.println("Basic thread to sleep for 5 seconds");
			thread.sleep(5000);
			synchronized (thread) {
				thread.wait();
			}
		} catch (InterruptedException iException) {
			iException.printStackTrace();
		}
	}
}
