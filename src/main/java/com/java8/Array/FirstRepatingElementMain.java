package com.java8.Array;

/* Java program to find first repeating element in arr[] */
import java.util.*; 
 
public class FirstRepatingElementMain { 
	public static void main (String[] args) throws java.lang.Exception 
	{ 
		int array[] = {10, 7, 8, 1, 8, 7, 6}; 
		int min=getFirstRepeatingElementArray(array); 
		// Print the result 
		if (min != -1) 
			System.out.println("The first repeating element in array is " + array[min]); 
		else
			System.out.println("There are no repeating elements"); 
	} 
	
	// This function prints the first repeating element in arr[] 
	static int getFirstRepeatingElementArray(int array[]) 
	{ 
		// Initialize index of first repeating element 
		int minimumIndex = -1; 
 
		// Creates an empty hashset 
		HashSet<Integer> set = new HashSet<>(); 
 
		// Iterate over the input array from right to left 
		for (int i=array.length-1; i>=0; i--) 
		{ 
			// If set contains the element, update minimum index 
			if (set.contains(array[i])) 
				minimumIndex = i; 
 
			else   // Else add element to hash set 
				set.add(array[i]); 
		} 
		return minimumIndex;
	} 
} 