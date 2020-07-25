package com.java8.List_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_To_List  {

	public static void main(String[] args) {
		
		//************  Array.asList *******************//
		Integer integerArray[] = {1,66,88,100, 201};
		List<Integer> integerList = Arrays.asList(integerArray);
		System.out.println("*** 1st integerList : "+integerList);
		changeArray(integerArray);
		
		System.out.println("*** 2nd integerArray : "+Arrays.toString(integerArray));
		System.out.println("*** 3d integerList : "+integerList);
		
		//************  Array.Stream *******************//
		 //Converting a primitive 'int' array to List
	    int intArray[] = {1, 11, 111, 1111, 10000};
	    List<Integer> integerList1 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
	    intArray[0] = 99;
	    System.out.println("array: "+Arrays.toString(intArray));
	    System.out.println("list: "+integerList1);
	     
	    //Converting an 'Integer'array to List
	    Integer integerArray1[] = {2, 22, 222, 2222, 20000};
	    List<Integer> integerList2 = Arrays.stream(integerArray1).collect(Collectors.toList());
	    integerArray1[0] = 88;
	    System.out.println("array: "+Arrays.toString(integerArray1));
	    System.out.println("list: "+integerList2);

	}

	private static void changeArray(Integer[] integerArray) {
		integerArray[0] = 22;
		
	}

}
