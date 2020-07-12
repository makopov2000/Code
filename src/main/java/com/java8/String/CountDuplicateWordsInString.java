package com.java8.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		countDuplicateWords("Java C Java Python Python Java");
		
		countDuplicateWordsWithStream("Java C Java Python Python Java");

	}
////Collections.frequency(numbers, 2);
	private static void countDuplicateWordsWithStream(String string) {
		// TODO Auto-generated method stub
		String words[] = string.split(" ");
		List<String> list = Arrays.asList(words);
		
		Set<String> unique = new HashSet<String>(list);
		for (String key : unique) {
		    System.out.println("==>> "+key + ": " + Collections.frequency(list, key));
		}
		

		
	}

	private static void countDuplicateWords(String string) {
		// TODO Auto-generated method stub
		String words[] = string.split(" ");
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		for (String word:words) {
			if (wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			} else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		
		wordCount.forEach((k,v)->System.out.println("Word: "+k+"; "+"Count: "+v));
		
	}

}
