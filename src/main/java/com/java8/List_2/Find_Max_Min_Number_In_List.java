package com.java8.List_2;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Find_Max_Min_Number_In_List {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
	    Integer expectedResult = 89;
	 
	    // then
	    Integer max = listOfIntegers
	      .stream()
	      .mapToInt(v -> v)
	      .max().orElseThrow(NoSuchElementException::new);
	    System.out.println(max);
	    
	    // then
	    Integer min = listOfIntegers
	      .stream()
	      .mapToInt(v -> v)
	      .min().orElseThrow(NoSuchElementException::new);
	    System.out.println(min);

	}

}
