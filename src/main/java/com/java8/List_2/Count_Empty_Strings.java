package com.java8.List_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Empty_Strings {

	public static void main(String[] args) {
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//		List<String>strings1 = new ArrayList<>();
//		strings1.add("abc");
//		strings1.add(" ");
//		strings1.add("zzz");
//		strings1.add(" ");
//		strings1.add("xxx");
		//get count of empty string
		Integer count = (int) strings.stream()
				.filter(r -> r.isEmpty())
				.count();

		
		System.out.println(count);

	}

}
