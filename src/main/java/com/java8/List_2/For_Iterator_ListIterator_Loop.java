package com.java8.List_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class For_Iterator_ListIterator_Loop {

	public static void main(String[] args) {
		ArrayList<Integer> aListNumbers = new ArrayList<Integer>();
		aListNumbers.add(1);
		aListNumbers.add(2);
		aListNumbers.add(3);
		aListNumbers.add(4);
		aListNumbers.add(5);
		 
		/*
		 * Iterate elements of an ArrayList using for loop
		 */
		for(int index = 0; index < aListNumbers.size(); index++){
		    System.out.println( aListNumbers.get(index) );
		}
		/*
		 * Iterate elements of an ArrayList using enhanced for loop
		 */
		for(Integer i : aListNumbers){
		    System.out.println( i );
		}
		/*
		 * Iterate elements of an ArrayList using Iterator
		 */
		//get an Iterator over ArrayList elements
		Iterator<Integer> iterator = aListNumbers.iterator();
		 
		//iterate using hasNext and next methods
		while( iterator.hasNext() ){
		    System.out.println( iterator.next() );
		}
		/*
		 * Iterate elements of an ArrayList using ListIterator
		 */
		//get a ListIterator over ArrayList elements
		ListIterator<Integer> listIterator = aListNumbers.listIterator();
		 
		//iterate using hasNext and next methods
		while( listIterator.hasNext() ){
		    System.out.println( listIterator.next() );
		}
		/*
		 * Iterate elements of an ArrayList using ListIterator
		 * in backward direction
		 */
		//get a ListIterator over ArrayList elements and specify ArrayList size
		ListIterator<Integer> listIterator2 = aListNumbers.listIterator(aListNumbers.size());
		 
		//iterate in reverse direction using hasPrevious and previous methods
		while( listIterator2.hasPrevious() ){
		    System.out.println( listIterator2.previous() );
		}

	}

}
