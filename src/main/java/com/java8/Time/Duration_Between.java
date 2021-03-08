package com.java8.Time;

import java.util.ArrayList;
import java.util.List;
import java.time.Instant;
import java.time.Duration;

public class Duration_Between {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		Instant start = Instant.now();
		list.forEach(r->System.out.println(r));
		Instant end = Instant.now();
		
		System.out.println("Duration: "+Duration.between(start, end).toMillis());

	}

}
