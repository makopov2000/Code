package com.java8.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.Map.Entity.Person;

public class Create_Map {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Mike", "Akopov","CCCP"));
		persons.add(new Person(2, "Alex", "Gonzales","USA"));
		persons.add(new Person(3, "Inna", "Pivovarova","USA"));
		persons.add(new Person(4, "Boris", "Pivovarova","CCCP"));

		System.out.println("========== convertList2MapWithFunctionIdentity ==============");
		convertList2MapWithFunctionIdentity(persons);
		System.out.println("========== convertList2MapCollectorsMappingCollectorsToSet ==============");
		convertList2MapCollectorsMappingCollectorsToSet();
		System.out.println("========== convertList2MapRetainOneValue ==============");
		convertList2MapRetainOneValue();
		System.out.println("========== convertList2MapSorted ==============");
		convertList2MapSorted();
		System.out.println("========== convertList2MapDuplicateKey ==============");
		convertList2MapGroupingBy(persons);
		System.out.println("========== convertList2MapOfMap ==============");
		convertList2MapOfMap(persons);

	}

	private static void convertList2MapWithFunctionIdentity(List<Person> persons) {
		Map<Integer, Person> id2PersonMap = persons.stream()
				.collect(Collectors.toMap(Person::getId, Function.identity()));
		id2PersonMap.forEach((key, value) -> System.out
				.println("convertList2MapWithFunctionIdentity with Function: " + key + " : " + value));

		Map<Integer, Person> id2PersonMap2 = persons.stream()
				.collect(Collectors.toMap(Person::getId, string -> string)); // instead of Function.identity()
		id2PersonMap2.forEach((key, value) -> System.out
				.println("convertList2MapWithFunctionIdentity with No Function: " + key + " : " + value));
	}

	private static void convertList2MapCollectorsMappingCollectorsToSet() {
		Map<Integer, Set<String>> len2StringMap = Arrays.asList("Java", "Core Java", "Streams", "Java", "Example")
				.stream().collect(Collectors.groupingBy(String::length,	Collectors.mapping(Function.identity(), Collectors.toSet())));
		len2StringMap.forEach((key, value) -> System.out.println("convertList2MapCollectorsMappingCollectorsToSet: "+key + " : " + value));
	}

	private static void convertList2MapRetainOneValue() {
		Map<String, Integer> len2StringMap = Arrays.asList("Java", "Example", "Core Java", "Streams", "Java", "Example")
				.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (oldValue, newValue) -> oldValue));
		len2StringMap.forEach((key, value) -> System.out.println("convertList2MapRetainOneValue: "+key + " : " + value));
	}
	
	private static void convertList2MapSorted() {
		List<String> asList = Arrays.asList("Java", "Core Java", "Streams", "Java", "Example")
				.parallelStream()
				.sorted()
				.collect(Collectors.toList());
		Map<String, Integer> len2StringMap = asList.stream()
				.collect(Collectors.toMap(Function.identity(),String::length, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		len2StringMap.forEach((key, value) -> System.out.println("convertList2MapSorted: "+key + " : " + value));
	}
	
	private static void convertList2MapGroupingBy(List<Person> persons) {
		Map<String, List<Person>> lastName2Persons = persons.stream()
				.collect(Collectors.groupingBy(Person::getLastName));
		lastName2Persons
				.forEach((key, value) -> System.out.println("convertList2MapDuplicateKey: " + key + " : " + value));
	}
	
	private static void convertList2MapOfMap(List<Person> persons) {
		Map<String, Map<String, List<Person>>> country2LastName2PersonMap = persons.stream()
				.collect(Collectors.groupingBy(Person::getCountry, Collectors.groupingBy(Person::getLastName)));
		country2LastName2PersonMap.forEach((key, value) -> System.out.println("convertList2MapOfMap: "+key + " : " + value));
	}

}
