package com.java8.concurrent;

import java.util.concurrent.*;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;

public class Callable_Future {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> c = new Callable() {
			@Override
			public String call() throws Exception {
				String s="";
				for(int i=0; i<10; i++) {s+=i;}
					return s;
			}
			
		};
		
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<String> future = exec.submit(c);
		String result = future.get();
		System.out.println(result);

	}

}
