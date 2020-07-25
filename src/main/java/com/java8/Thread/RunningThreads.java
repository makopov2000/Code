package com.java8.Thread;
 class SecondThread implements Runnable{
	
	@Override
	  public void run() {
	    System.out.println("Thread ran: ");
	  }
	}
	//RunningThreads.java
	public class RunningThreads {
	 
	  public static void main(String args[]){
		 SecondThread secondThread = new SecondThread();
	    Thread secondThread1 = new Thread(secondThread);
	    Thread secondThread2 = new Thread(secondThread);
	    secondThread1.start();
	    secondThread2.start();
	  }
	 
	}
