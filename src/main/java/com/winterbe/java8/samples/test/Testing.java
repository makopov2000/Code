package com.winterbe.java8.samples.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

    }
}
