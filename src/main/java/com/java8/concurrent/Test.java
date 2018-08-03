package com.java8.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Test {
public static String x;
    public static void main(String[] args) {

        AtomicInteger atom = new AtomicInteger(0);
        IntStream.range(0, 3)
                .forEach(i -> {
                    System.out.println(atom.updateAndGet(n -> n+2));

                });
    }
}
