package com.java8.Map;


import java.util.HashMap;

public class EntrySet_KeySet_Value {

	    public static void main(String[] args) {
	        HashMap<String, Integer> numbers = new HashMap<>();

	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        System.out.println("HashMap: " + numbers);

	        // Using entrySet()
	        System.out.println("Key/Value mappings: " + numbers.entrySet());

	        // Using keySet()
	        System.out.println("Keys: " + numbers.keySet());

	        // Using values()
	        System.out.println("Values: " + numbers.values());
	    }
	}