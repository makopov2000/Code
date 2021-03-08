package com.java8.Interfaces;

import java.nio.file.*;
import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		///////////////////////////////////////////////////  Compare_Arrays example
		Integer aa[] = {1,2,3,4,5};
		String bb[] = {"Mike","Inna", "Alex"};
		System.out.println(Compare_Arrays.count(aa, 3));
		System.out.println(Compare_Arrays.count(bb, "s"));

	}

}
