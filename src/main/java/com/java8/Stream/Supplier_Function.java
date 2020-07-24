package com.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.function.Supplier;

/**
 * Testing the order of execution.
 *
 * @author Benjamin Winterberg
 */
public class Supplier_Function {

    public static void main(String[] args) {
        List<String> strings =
            Arrays.asList("d2", "a2", "b1", "b3", "c");

        filterForEach(strings);
        mapFilterForEach(strings);
        filterMapForEach(strings);
        sortFilterMapForEach(strings);
        filterSortMapForEach(strings);
        mapAnyMatch(strings);
        filter(strings);
        suplierStream(strings);
    }

    private static void suplierStream(List<String> stringCollection) {
//        Supplier<List <String>> streamSupplier =  () -> stringCollection
//                .stream()
//                .filter(s -> s.startsWith("a"));
//        streamSupplier.get().anyMatch(s -> true);
//        streamSupplier.get().noneMatch(s -> true);
        
        Supplier<String> streamSupplier =  () -> stringCollection
                .stream()
                .filter(s -> s.startsWith("a"))
                .findFirst()
                .orElse(null);

        System.out.println("suplierStream: "+streamSupplier.get());
    }

    // stream has already been operated upon or closed
    private static void filter(List<String> stringCollection) {
        Stream<String> stream = stringCollection
            .stream()
            .filter(s -> s.startsWith("a"));

        System.out.println("filter: "+stream.anyMatch(s -> true));
        System.out.println("filter: "+stream.noneMatch(s -> true));
    }

    // short-circuit
    private static void mapAnyMatch(List<String> stringCollection) {
        stringCollection
            .stream()
            .map(s -> {
                System.out.println("mapAnyMatch map:      " + s);
                return s.toUpperCase();
            })
            .anyMatch(s -> {
                System.out.println("mapAnyMatch anyMatch: " + s);
                return s.startsWith("A");
            });
    }

    private static void filterSortMapForEach(List<String> stringCollection) {
        stringCollection
            .stream()
            .filter(s -> {
                System.out.println("filterSortMapForEach filter:  " + s);
                return s.toLowerCase().startsWith("a");
            })
            .sorted((s1, s2) -> {
                System.out.printf("filterSortMapForEach sort:    %s; %s\n", s1, s2);
                return s1.compareTo(s2);
            })
            .map(s -> {
                System.out.println("filterSortMapForEach map:     " + s);
                return s.toUpperCase();
            })
            .forEach(s -> System.out.println("filterSortMapForEach forEach: " + s));
    }

    // sorted = horizontal
    private static void sortFilterMapForEach(List<String> stringCollection) {
        stringCollection
            .stream()
            .sorted((s1, s2) -> {
                System.out.printf("sortFilterMapForEach sort:    %s; %s\n", s1, s2);
                return s1.compareTo(s2);
            })
            .filter(s -> {
                System.out.println("sortFilterMapForEach filter:  " + s);
                return s.toLowerCase().startsWith("a");
            })
            .map(s -> {
                System.out.println("sortFilterMapForEach map:     " + s);
                return s.toUpperCase();
            })
            .forEach(s -> System.out.println("sortFilterMapForEach forEach: " + s));
    }

    private static void filterMapForEach(List<String> stringCollection) {
        stringCollection
            .stream()
            .filter(s -> {
                System.out.println("filterMapForEach filter:  " + s);
                return s.startsWith("a");
            })
            .map(s -> {
                System.out.println("filterMapForEach map:     " + s);
                return s.toUpperCase();
            })
            .forEach(s -> System.out.println("filterMapForEach forEach: " + s));
    }

    private static void mapFilterForEach(List<String> stringCollection) {
        stringCollection
            .stream()
            .map(s -> {
                System.out.println("mapFilterForEach map:     " + s);
                return s.toUpperCase();
            })
            .filter(s -> {
                System.out.println("mapFilterForEach filter:  " + s);
                return s.startsWith("A");
            })
            .forEach(s -> System.out.println("mapFilterForEach forEach: " + s));
    }

    private static void filterForEach(List<String> stringCollection) {
        stringCollection
            .stream()
            .filter(s -> {
                System.out.println("filterForEach filter:  " + s);
                return true;
            })
            .forEach(s -> System.out.println("filterForEach forEach: " + s));
    }

}