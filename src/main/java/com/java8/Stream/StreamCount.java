package com.java8.Stream;

	import java.util.ArrayList;
	import java.util.List;

	public class StreamCount {
	  public static void main(String[] args) {
	    List<Integer> numbers = new ArrayList<>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(3);
	    numbers.add(4);
	    numbers.add(5);

	    // Count
	    long count = numbers.stream().count();
	    System.out.println("Count : " + count);

	    // Find Any
	    Integer findEle = numbers.stream()
	        .findAny()
	        .get();
	    System.out.println("FindAny : " + findEle);

	    // Find First
	    Integer findFirstEle = numbers.stream()
	        .findFirst()
	        .get();
	    System.out.println("FindFirst : " + findFirstEle);

	    // Max
	    Integer max = numbers.stream()
	        .max((a, b) -> a - b)
	        .get();
	    System.out.println("Max : " + max);

	    // Min
	    Integer min = numbers.stream()
	        .min((a, b) -> a - b)
	        .get();
	    System.out.println("Min : " + min);

	  }
	}