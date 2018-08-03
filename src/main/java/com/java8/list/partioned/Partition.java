package com.java8.list.partioned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Partition {

	public static void main(String[] args) {
		final List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "X");

		final AtomicInteger counter = new AtomicInteger(0);
		final int size = 4;

		final Collection<List<String>> partitioned = list.stream()
				.collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size)).values();

		// partitioned.stream()
		// .forEach(s -> System.out.println(s));

		partitioned.forEach(System.out::println);
		/////////////////////////////////////////////////////

		List<Student> students = new ArrayList<>();

		students.add(new Student("mike", "java", 100));
		students.add(new Student("alex", "java", 12));
		students.add(new Student("inna", "java", 16));
		students.add(new Student("boris", "java", 21));
		students.add(new Student("innel", "java", 18));
		students.add(new Student("valery", "java", 6));
		students.add(new Student("amila", "java", 1));
		students.add(new Student("artem", "java", 70));
		students.add(new Student("ira", "java", 44));
		students.add(new Student("angel", "java", 22));
		students.add(new Student("bella", "java", 11));

		final AtomicInteger counter1 = new AtomicInteger(0);
		final int size1 = 3;

		final Collection<List<Student>> partitioned1 = students.stream()
				.collect(Collectors.groupingBy(it -> counter1.getAndIncrement() / size1)).values();

		AtomicInteger atomicInteger = new AtomicInteger(0);
		partitioned1.stream().forEach(s -> {
			atomicInteger.getAndIncrement();
			System.out.println("Printing Partition: " + atomicInteger);
			s.stream().forEach(sa -> System.out.println(sa.getName() + ":" + sa.getAge()));
		});
	}

}
