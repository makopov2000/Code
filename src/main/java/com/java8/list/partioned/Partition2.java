package com.java8.list.partioned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Partition2 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		 
	    Map<Integer, List<Integer>> groups = 
	      intList.stream().collect(Collectors.groupingBy(s -> (s - 1) / 3));	    
	    List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
	    List<Integer> lastPartition = subSets.get(2);
//	    List<Integer> expectedLastPartition = Lists.<Integer> newArrayList(7, 8);
//	    assertThat(subSets.size(), equalTo(3));
//	    assertThat(lastPartition, equalTo(expectedLastPartition));

	    List<String> list = Arrays.asList("a", "b","c","a","c","a","b","a");
	    Collection<List<String>> part = partition(list, 3);
	    System.out.println("Partition by groupingBy SIZE: ");
	    part.stream().forEach(p -> System.out.println(p));
	    
//	    Collection<List<String>> part2 = list.stream()
//	    		.collect(Collectors.groupingBy())
	    
//	    Collection<List<String>> part2 = (Collection<List<String>>) list.stream()
//	    										.map(it -> it)
//	    										.collect(Collectors.partitioningBy("a"));
	    
	}
	
    private static  <T> Collection<List<T>> partition(List<T> list, int size) {
        final AtomicInteger counter = new AtomicInteger(0);

        return list.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
                .values();
    }

}

