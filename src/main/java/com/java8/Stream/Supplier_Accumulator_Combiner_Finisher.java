package com.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Benjamin Winterberg
 */
public class Supplier_Accumulator_Combiner_Finisher {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

//		@Override
//		public String toString() {
//			return "Person [name=" + name + ", age=" + age + "]";
//		}

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Person> persons =
            Arrays.asList(
                new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12));

        filterCollectToList(persons);
        collectorsGroupingBy(persons);
        collectorsAveragingInt(persons);
        collectorsSummarizingInt(persons);
        collectorsJoining(persons);
        collectorsToMap(persons);
        collectorSupplierAccumulatorCombinerFinisher1(persons);
        collectorSupplierAccumulatorCombinerFinisher2(persons);
        collectorSupplierAccumulatorCombinerFinisher3(persons);
    }

    private static void filterCollectToList(List<Person> persons) {
        List<Person> filtered =
            persons
                .stream()
                .filter(p -> p.name.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println("filterCollectToList: "+filtered);    // [Peter, Pamela]
    }

    private static void collectorsGroupingBy(List<Person> persons) {
        Map<Integer, List<Person>> personsByAge = persons
            .stream()
            .collect(Collectors.groupingBy(p -> p.age));

        personsByAge
            .forEach((age, p) -> System.out.format("collectorsGroupingBy age %s: %s\n", age, p));

        // age 18: [Max]
        // age 23:[Peter, Pamela]
        // age 12:[David]
    }

    private static void collectorsAveragingInt(List<Person> persons) {
        Double averageAge = persons
            .stream()
            .collect(Collectors.averagingInt(p -> p.age));

        System.out.println("collectorsAveragingInt: "+averageAge);     // 19.0
    }

    private static void collectorsSummarizingInt(List<Person> persons) {
        IntSummaryStatistics ageSummary =
            persons
                .stream()
                .collect(Collectors.summarizingInt(p -> p.age));

        System.out.println("collectorsSummarizingInt: "+ageSummary);
        // IntSummaryStatistics{count=4, sum=76, min=12, average=19,000000, max=23}
    }

    private static void collectorsJoining(List<Person> persons) {
        String names = persons
            .stream()
            .filter(p -> p.age >= 18)
            .map(p -> p.name)
            .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println("collectorsJoining: "+names);
        // In Germany Max and Peter and Pamela are of legal age.
    }

    private static void collectorsToMap(List<Person> persons) {
        Map<Integer, String> map = persons
            .stream()
            .collect(Collectors.toMap(
                p -> p.age,
                p -> p.name,
                (name1, name2) -> name1 + ";" + name2));

        System.out.println("collectorsToMap: "+map);
        // {18=Max, 23=Peter;Pamela, 12=David}
    }

    private static void collectorSupplierAccumulatorCombinerFinisher1(List<Person> persons) {
        Collector<Person, StringJoiner, String> personNameCollector =
            Collector.of(
                () -> new StringJoiner(" | "),          // supplier
                (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
                (j1, j2) -> j1.merge(j2),               // combiner
                StringJoiner::toString);                // finisher

        String names = persons
            .stream()
            .collect(personNameCollector);

        System.out.println("collectorSupplierAccumulatorCombinerFinisher1: "+names);  // MAX | PETER | PAMELA | DAVID
    }

    private static void collectorSupplierAccumulatorCombinerFinisher2(List<Person> persons) {
        Collector<Person, StringJoiner, String> personNameCollector =
            Collector.of(
                () -> {
                    System.out.println("supplier");
                    return new StringJoiner(" | ");
                },
                (j, p) -> {
                    System.out.format("accumulator: p=%s; j=%s\n", p, j);
                    j.add(p.name.toUpperCase());
                },
                (j1, j2) -> {
                    System.out.println("merge");
                    return j1.merge(j2);
                },
                j -> {
                    System.out.println("finisher");
                    return j.toString();
                });

        String names = persons
            .stream()
            .collect(personNameCollector);

        System.out.println("collectorSupplierAccumulatorCombinerFinisher2: "+names);  // MAX | PETER | PAMELA | DAVID
    }

    private static void collectorSupplierAccumulatorCombinerFinisher3(List<Person> persons) {
        Collector<Person, StringJoiner, String> personNameCollector =
            Collector.of(
                () -> {
                    System.out.println("supplier");
                    return new StringJoiner(" | ");
                },
                (j, p) -> {
                    System.out.format("accumulator: p=%s; j=%s\n", p, j);
                    j.add(p.name.toUpperCase());
                },
                (j1, j2) -> {
                    System.out.println("merge");
                    return j1.merge(j2);
                },
                j -> {
                    System.out.println("finisher");
                    return j.toString();
                });

        String names = persons
            .parallelStream()
            .collect(personNameCollector);

        System.out.println("collectorSupplierAccumulatorCombinerFinisher3: "+names);  // MAX | PETER | PAMELA | DAVID
    }
}
