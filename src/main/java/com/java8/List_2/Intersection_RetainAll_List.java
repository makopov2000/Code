package com.java8.List_2;

import java.util.ArrayList;

public class Intersection_RetainAll_List {

	public static void main(String[] args) {
		ArrayList<Integer> aListNumbers = new ArrayList<Integer>();
		aListNumbers.add(1);
		aListNumbers.add(2);
		aListNumbers.add(3);
		aListNumbers.add(4);
		aListNumbers.add(5);
		 
		//another ArrayList
		ArrayList<Integer> aListOddNumbers = new ArrayList<Integer>();
		aListOddNumbers.add(1);
		aListOddNumbers.add(3);
		aListOddNumbers.add(5);
		 
		/*
		 * To get the intersection of two ArrayList objects,
		 * use the retainAll method.
		 */
		 
		//this will retain only elements which are present in the aListOddNumbers
		aListNumbers.retainAll(aListOddNumbers);
		 
		System.out.println( "ArrayList intersection: " + aListNumbers );

	}

}
