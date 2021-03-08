package com.java8.Thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//******************  Callable start
		Callable<Integer> task = () -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		        return 123;
		    }
		    catch (InterruptedException e) {
		        throw new IllegalStateException("task interrupted", e);
		    }
		};
		ExecutorService executorCall = Executors.newFixedThreadPool(1);
		Future<Integer> futureCall = executorCall.submit(task);

		System.out.println("future done? " + futureCall.isDone());

		Integer result = futureCall.get();

		System.out.println("future done? " + futureCall.isDone());
		System.out.print("result: " + result);
		//******************  Callable end
		System.out.println("");
		//******************  invokeAll start
		ExecutorService executor = Executors.newWorkStealingPool();

		List<Callable<String>> callables = Arrays.asList(
		        () -> "task1",
		        () -> "task2",
		        () -> "task3");

		executor.invokeAll(callables)
		    .stream()
		    .map(future -> {
		        try {
		            return future.get();
		        }
		        catch (Exception e) {
		            throw new IllegalStateException(e);
		        }
		    })
		    .forEach(System.out::println);
		//******************  invokeAll end

	}

}
