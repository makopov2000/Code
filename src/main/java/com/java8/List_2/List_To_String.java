package com.java8.List_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_To_String {
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
	    String result = intList.stream()
	      .map(n -> String.valueOf(n))
	      .collect(Collectors.joining("-", "{", "}"));
	 
	    System.out.println(result);
	}

}
