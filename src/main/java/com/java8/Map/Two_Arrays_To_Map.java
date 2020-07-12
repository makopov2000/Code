package com.java8.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Two_Arrays_To_Map {
	
	public static void main(String[] args) {
		//keys array
		Integer[] arrayKeys = {1, 2, 3, 4, 5};
		 
		//values array
		String[] arrayValues = {"Jack", "Emily", "Ryan", "John", "Maria"};
		 
		Map<Integer, String> hMapData = new HashMap<Integer, String>();
		 
		/*
		 * Assuming both the arrays are of the same size
		 */
		for( int i = 0; i < arrayKeys.length; i++ ){
		    
		    hMapData.put( arrayKeys[i], arrayValues[i] );
		}
		 
		System.out.println("HashMap contains: " + hMapData);
	}

}
