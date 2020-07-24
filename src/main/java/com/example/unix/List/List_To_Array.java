package com.example.unix.List;

import java.util.ArrayList;
import java.util.Arrays;

public class List_To_Array {

	public static void main(String[] args) {
		ArrayList<String> aListBasicColors = new ArrayList<String>();
		aListBasicColors.add("Red");
		aListBasicColors.add("Green");
		aListBasicColors.add("Blue");
		 
		/*
		 * To convert an ArrayList to an array, use the
		 * toArray method.
		 */
		//create an empty array with the same type and size
		String[] strBasicColors = new String[ aListBasicColors.size() ];
		 
		//convert ArrayList to String array
		strBasicColors = aListBasicColors.toArray( strBasicColors );
		 
		System.out.println("String array contains: " + Arrays.toString( strBasicColors ));

	}

}
