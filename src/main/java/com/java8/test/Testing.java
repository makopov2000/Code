package com.java8.test;

import java.util.*;
import java.util.stream.Collectors;

public class Testing {

    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("mike");
        list.add("alex");
        list.add("innel");
        list.add("mike");
        list.stream().forEach(l-> System.out.println(l));
        System.out.println("-------------");
        Set<String> set = new HashSet<>(list);
        set.stream().forEach(s-> System.out.println(s));
        System.out.println("-------------");
        List<String> sort = list.stream().sorted().collect(Collectors.toList());
        sort.stream().forEach(l-> System.out.println(l));

        List<String> test = new ArrayList<>(list);
        Set<String> set1 = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        System.out.println(test);

        // List all System properties
        Properties pros = System.getProperties();
        pros.list(System.out);
   
        // Get a particular System property given its key
        // Return the property value or null
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
     

    }
}
