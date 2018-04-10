package com.winterbe.java8.samples.maps;

import java.util.*;
import java.util.stream.Collectors;

public class MapIterate {

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();

        unsortedMap.put("Mike1", 1);
        unsortedMap.put("Mike8", 8);
        unsortedMap.put("Mike5", 5);
        unsortedMap.put("Mike6", 6);
        unsortedMap.put("Mike3", 3);
        unsortedMap.put("Mike2", 2);
        Iterator<String> iterator = unsortedMap.keySet().iterator();

        while(iterator.hasNext()) {
            System.out.println(unsortedMap.get(iterator.next()));
        }
// By Key
        Map<String, Integer> result = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sort by KEY:");
        result.entrySet().stream()
                .forEach(r-> System.out.println(r.getKey()+"-"+r.getValue()));
//BY KEY Reverse
        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
        System.out.println("Sort by KEY REVERSE:");
        result2.entrySet().stream()
                .forEach(r-> System.out.println(r.getKey()+"-"+r.getValue()));

//BY VALUE
        Map<String, Integer> result3 = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sort by VALUE:");
        result3.entrySet().stream()
                .forEach(r-> System.out.println(r.getKey()+"-"+r.getValue()));

//BY VALUE Reverse
        Map<String, Integer> result4 = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sort by VALUE Reverse:");
        result4.entrySet().stream()
                .forEach(r-> System.out.println(r.getKey()+"-"+r.getValue()));

    }
}
