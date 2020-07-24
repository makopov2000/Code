package com.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author Benjamin Winterberg
 */
public class Filter {

    public static void main(String[] args) {
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
            .stream()
            .filter(s -> s.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);

        // C1
        // C2
    }
    
    public static int countPairs(List<Integer> numbers1, int k) {
        // Write your code here
        final AtomicInteger counter = new AtomicInteger(0);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);

       Collection<List<Integer>> part = numbers.stream()
                    .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / 2))
                    .values();;
        part.forEach(r->System.out.println(r));
                    
        for ( List<Integer> x : part){

        }
		
        return k;
}
}
