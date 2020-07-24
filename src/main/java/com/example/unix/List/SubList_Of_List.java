package com.example.unix.List;

import java.util.ArrayList;
import java.util.List;

public class SubList_Of_List {

	public static void main(String[] args) {
		ArrayList<Integer> aListNumbers = new ArrayList<Integer>();
		aListNumbers.add(1);
		aListNumbers.add(2);
		aListNumbers.add(3);
		aListNumbers.add(4);
		aListNumbers.add(5);
		 
		/*
		 * To get a sublist from ArrayList, use the
		 * subList method.
		 */
		//this will returns a sublist containing "2", "3" and "4"
		List<Integer> sublist = aListNumbers.subList(1, 4);
		 
		System.out.println("sublist elements: " + sublist);
		 
		/*
		 * Changing the sublist will change the ArrayList
		 * too, and vice versa
		 */
		//replace first element of sublist i.e. "2" with "222"
		sublist.set(0, 222);        
		 
		System.out.println("sublist elements: " + sublist);
		System.out.println("arraylist elements: " + aListNumbers);

	}

}
