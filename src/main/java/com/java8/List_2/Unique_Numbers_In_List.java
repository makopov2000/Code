package com.java8.List_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unique_Numbers_In_List {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream()
				.map( i -> i*i)
				.distinct()
				.collect(Collectors.toList());
		
		squaresList.forEach(r->System.out.println(r));
		
		System.out.println("unique squares in List:"+squaresList);
		
		List<Integer> list = numbers.stream()
				.map( i -> Integer.valueOf(i))
				.distinct()
				.collect(Collectors.toList());
		System.out.println("unique numbers in List :"+list);
		
	}
}
