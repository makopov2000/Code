package com.java8.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.collections4.ListUtils;

public class ListPartition {
    public static List<String> list = new ArrayList<>();
    public static List<List<String>> partitionedList = new ArrayList<>();

    public static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");

        performPartitionedList();

        atomicInteger.set(0);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        partitionedList.stream()
                .forEach(p -> {
                    atomicInteger.incrementAndGet();
                    executorService.submit(()-> {
                        p.stream()
                                .forEach(x -> {
                                    System.out.println(Thread.currentThread()
                                            .getName()+"-> " + " and Value in the partion list: " + x);
                                });
                    });
                });

        executorService.shutdownNow();
        System.out.println("shutdown finished");
    }

    private static void performPartitionedList() {
        partitionedList = ListUtils.partition(list,3);

    }
}
