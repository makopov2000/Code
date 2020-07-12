package com.java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Benjamin Winterberg
 */
public class StreamsUniqueDuplicates {

	public static void main(String[] args) {

		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		// Unique entries
		List<String> x = stringCollection.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Unique list: " + x);

		// Get Duplicates
		Set<String> process = new HashSet<>();
		Set<String> dupResult = stringCollection.stream().filter(l -> !process.add(l)).collect(Collectors.toSet());
		System.out.println("Duplicate list: " + dupResult);

		Set<String> secondEx = stringCollection.stream()
				.filter(s -> stringCollection.stream().filter(z -> z == s).count() > 1).collect(Collectors.toSet());
		System.out.println("Duplicate list with Filter in Filter: " + secondEx);

		List<Integer> duplicates = IntStream.of(1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2).boxed()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println("Duplicate Numbers: " + duplicates);

		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
		Set<Integer> duplicated = numbers.stream().filter(n -> numbers.stream().filter(z -> z == n).count() > 1)
				.collect(Collectors.toSet());
		System.out.println("Duplicate Numbers example 2: " + duplicated);

		// filtering

		stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);

		// "aaa2", "aaa1"

		// sorting
		System.out.println("Sorting");
		stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);

		List<String> l = Arrays.asList("Da", "EFGa", "Aa", "ABa", "Ca");
		l.stream().map(s -> s.toLowerCase()).filter(s -> s.contains("a")).sorted((s1, s2) -> s1.length() - s2.length())
				.forEach(System.out::println);

		// "aaa1", "aaa2"

		// mapping

		stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);

		// "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"

		// matching

		boolean anyStartsWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));

		System.out.println(anyStartsWithA); // true

		boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));

		System.out.println(allStartsWithA); // false

		boolean noneStartsWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));

		System.out.println(noneStartsWithZ); // true

		// counting

		long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();

		System.out.println(startsWithB); // 3

		// reducing

		Optional<String> reduced = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
		// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"

	}

}
