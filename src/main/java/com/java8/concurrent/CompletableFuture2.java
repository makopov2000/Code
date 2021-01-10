package com.java8.concurrent;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.functors.ForClosure;
//import org.apache.commons.lang.Validate;
import org.apache.http.MethodNotSupportedException;
//import org.omg.CORBA.PUBLIC_MEMBER;

public class CompletableFuture2 {
//	static List<Integer> ageList = new ArrayList<>();
//	{	ageList = Arrays.asList(1,2,3,4,5,21,31,44,22,6,7,8,32);
//	}

	public static void main(String[] args) {
//		methThenReturn();
//		methThenAcceptThenRun();
//		methThenApplyAsync();
//		methFutureAll();
//		methFutureAny();
		try {
			methException();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void methException() throws InterruptedException {
//		CompletableFuture.supplyAsync(() -> {
//			// Code which might throw an exception
//			return "Some result";
//		}).thenApply(result -> {
//			return "processed result";
//		}).thenApply(result -> {
//			return "result after further processing";
//		}).thenAccept(result -> {
//			// do something with the final result
//		});
		
		
		//////  exceptionally
//		Integer age = -1;
//
//		CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
//		    if(age < 0) {
//		    	System.out.println("Exception.Throw: "+Thread.currentThread().getName());
//		        throw new IllegalArgumentException("Age can not be negative");
//		    }
//		    if(age > 18) {
//		        return "Adult";
//		    } else {
//		        return "Child";
//		    }
//		}).exceptionally(ex -> {
//		    System.out.println("Oops! We have an exception - " + ex.getMessage());
//		    return "Unknown!";
//		});
//
//		try {
//			System.out.println("Maturity from exceptionally : " + maturityFuture.get());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		} 
//		List<Integer> ageList = new ArrayList<>();
//		ageList = Arrays.asList(1,2,3,4,5,21,31,44,22,6,7,8,32);	
		
//		////////  handle
//		Integer age = -1;
//
//		CompletableFuture<String> maturityFuture1 = CompletableFuture.supplyAsync(() -> {
//		    if(age < 0) {
//		        throw new IllegalArgumentException("Age can not be negative");
//		    }
//		    if(age > 18) {
//		        return "Adult";
//		    } else {
//		        return "Child";
//		    }
//		}).handle((res, ex) -> {
//		    if(ex != null) {
//		        System.out.println("Oops! We have an exception - " + ex.getMessage());
//		        return "Unknown!";
//		    }
//		    return "Child";
//		});
//
//		System.out.println("Maturity : " + maturityFuture.get());;

//		List<Integer> ageList = new ArrayList<>();
		final List<Integer> ageList = Arrays.asList(1,2,3,4,5,21,31,44,22,6,7,8,32);
		
//		List<CompletableFuture<String>> listCompl = new ArrayList<>();
//		for (Integer i : ageList) {
//			listCompl.add(CompletableFuture.supplyAsync(() -> {
//				System.out.println(Thread.currentThread().getName());
//		    return (ageList.get(i)>18)?"Adult":"Child";
//			})
//		);
//		}
		
		List<CompletableFuture<String>> listCompl = ageList.stream()
				.mapToInt(Integer::intValue)
				.mapToObj(val -> (val>18)?"Adult":"Child")
				.map(result -> CompletableFuture.completedFuture(result).thenApplyAsync(r -> r.toUpperCase())
				)
				.collect(Collectors.toList())
				;
		
		System.out.println("Size of List: "+listCompl.size());
		
		listCompl.forEach(action -> {
			try {
				assertTrue(action.isDone());
				System.out.println(action.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		});
		
////		List<String> output = Stream.of(1,2,3,4,5,21,31,44,22,6,7,8,32)
//				List<String> a = ageList.stream()
//				.mapToInt(Integer::intValue)
//				.mapToObj(i -> (i>18)?"Adult":"Child")
//				.collect(Collectors.toList());
//		
//		a.forEach(b -> System.out.println(a));


				
				
//		try {
//			System.out.println("Maturity from handle : " + maturityFuture1.get());
////			maturityFuture1.forEach(a -> System.out.println("Result: "+ a.get());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		}
		
	}

	private static void methFutureAll() {
//		CompletableFuture<String> downloadWebPage(String pageLink) {
//			return CompletableFuture.supplyAsync(() -> {
//				// Code to download and return the web page's content
//			});
//		} 
//		
//		List<String> webPageLinks = Arrays.asList(...)	// A list of 100 web page links
//
//				// Download contents of all the web pages asynchronously
//				List<CompletableFuture<String>> pageContentFutures = webPageLinks.stream()
//				        .map(webPageLink -> downloadWebPage(webPageLink))
//				        .collect(Collectors.toList());
//
//
//				// Create a combined Future using allOf()
//				CompletableFuture<Void> allFutures = CompletableFuture.allOf(
//				        pageContentFutures.toArray(new CompletableFuture[pageContentFutures.size()])
//				);
		
	}

	private static void methFutureAny() {
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(2);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "Result of Future 1";
		});
		
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "Result of Future 2";
		});

		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(3);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "Result of Future 3";
		});

		CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3);

		try {
			System.out.println(anyOfFuture.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} // Result of Future 2
		
	}

	private static void methThenApplyAsync() {
//		Executor executor = Executors.newFixedThreadPool(2);
//		CompletableFuture.supplyAsync(() -> {
//		    return "Some result";
//		}).thenApplyAsync(result -> {
//		    // Executed in a thread obtained from the executor
//		    return "Processed Result";
//		}, executor);
		
	}

	private static void methThenAcceptThenRun() {
//		// thenAccept() example
//		CompletableFuture.supplyAsync(() -> {
//			return ProductService.getProductDetail(productId);
//		}).thenAccept(product -> {
//			System.out.println("Got product detail from remote service " + product.getName())
//		});
//		
//		// thenRun() example
//		CompletableFuture.supplyAsync(() -> {
//		    // Run some computation  
//		}).thenRun(() -> {
//		    // Computation Finished.
//		});
		
	}

	public static void methThenReturn() {
		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "Rajeev";
		}).thenApply(name -> {
		    return "Hello " + name;
		}).thenApply(greeting -> {
		    return greeting + ", Welcome to the CalliCoder Blog";
		});

		// Prints - Hello Rajeev, Welcome to the CalliCoder Blog
		try {
			System.out.println(welcomeText.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		////////////////////////////
		// Create a CompletableFuture
		CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
		   try {
		       TimeUnit.SECONDS.sleep(1);
		   } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		   }
		   return "Rajeev";
		});

		// Attach a callback to the Future using thenApply()
		CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
		   return "Hello " + name;
		});

		// Block and get the result of the future.
		try {
			System.out.println(greetingFuture.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Hello Rajeev
		
	}

}
