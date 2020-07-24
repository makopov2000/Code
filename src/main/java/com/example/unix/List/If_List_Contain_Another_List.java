package com.example.unix.List;

import java.util.ArrayList;

public class If_List_Contain_Another_List {

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
		 * this will print true, as aListNumbers contains
		 * all the elements of aListOddNumbers
		 * 
		 */
		System.out.println( aListNumbers.containsAll(aListOddNumbers) );
		        
		//add an element to another ArrayList
		aListOddNumbers.add(7);
		 
		/*
		 * this will print false, as aListNumbers does not contain
		 * all the elements of aListOddNumbers (7 is missing)
		 * 
		 */
		System.out.println( aListNumbers.containsAll(aListOddNumbers) );

	}

}
