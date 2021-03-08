package com.java8.test;

import java.util.function.Predicate;

public interface CourseFilter extends Predicate<String>{
	public default boolean test(String str) {
		return str.equals("Java");
	}

}
