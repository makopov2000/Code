package com.java8.List_2;

import java.util.ArrayList;

public class IndexOf {

	public static void main(String[] args) {
		ArrayList<String> aListColors = new ArrayList<String>();
		aListColors.add("Red");
		aListColors.add("Green");
		aListColors.add("Blue");
		aListColors.add("Red");
		aListColors.add("Yellow");
		aListColors.add("Blue");
		aListColors.add("White");
		 
		/*
		 * To get an index of the first occurrence of the element, use the
		 * indexOf method.
		 */
		//this will return 0 i.e. the index where the first "Red" is located in the list
		System.out.println( aListColors.indexOf("Red") );
		 
		//this will return -1, as the list does not contain "Black"
		System.out.println( aListColors.indexOf("Black") );
		
		
		/*
		 * To search the last index of the specified element, use 
		 * the lastIndexOf method.
		 */
		//this will return 3, i.e. the index where the last "Red" is located in the list
		System.out.println( aListColors.lastIndexOf("Red") );
		 
		//this will return 1, i.e. the only index where "Green" is located
		System.out.println( aListColors.lastIndexOf("Green") );
		 
		//this will return -1 because list does not contain the "Black"
		System.out.println( aListColors.lastIndexOf("Black") );
	}

}
