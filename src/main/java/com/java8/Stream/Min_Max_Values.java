package com.java8.Stream;

import java.util.Collections;
import java.util.ArrayList;

public class Min_Max_Values {

	public static void main(String[] args) {
		 // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }

}
