package com.java8.Map;

import java.util.HashMap;

public class Replace_Recompute_Merge {

	 public static void main(String[] args) {

	        HashMap<String, Integer> numbers = new HashMap<>();
	        numbers.put("First", 1);
	        numbers.put("Second", 2);
	        numbers.put("Third", 3);
	        System.out.println("Original HashMap: " + numbers);

	        ///////////////////////////////   Using replace()
	        System.out.println(" ++++++++   Using replace()");
	        numbers.replace("Second", 22);
	        numbers.replace("Third", 3, 33);
	        System.out.println("HashMap using replace(): " + numbers);

	        // Using replaceAll()
	        numbers.replaceAll((key, oldValue) -> oldValue + 2);
	        System.out.println("HashMap using replaceAll(): " + numbers);
	        
	     /////////////////////////////////  Using compute()
	        System.out.println(" ++++++++   Using compute()");
	        numbers.compute("First", (key, oldValue) -> oldValue + 2);
	        numbers.compute("Second", (key, oldValue) -> oldValue + 1);
	        System.out.println("HashMap using compute(): " + numbers);

	        // Using computeIfAbsent()
	        numbers.computeIfAbsent("Three", key -> 5);
	        System.out.println("HashMap using computeIfAbsent(): " + numbers);

	        // Using computeIfPresent()
	        numbers.computeIfPresent("Second", (key, oldValue) -> oldValue * 2);
	        System.out.println("HashMap using computeIfPresent(): " + numbers);
	        
	     /////////////////////////////////  Using merge() Method
	        System.out.println(" ++++++++   Using merge() Method");
	        numbers.merge("First", 4, (oldValue, newValue) -> oldValue + newValue);
	        System.out.println("New HashMap: " + numbers);
	    }
	}