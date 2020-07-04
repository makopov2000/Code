package com.java8.Array;

import java.util.HashSet;
import java.util.Scanner;
 
public class FreqOfEachElems {
 
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,34};

		HashSet<Integer> processed = new HashSet();
		for (int val : arr) {
			if (!processed.contains(val)) {
				System.out.println("Frequency of " + val + " is : " + 
						solveRecursive(0, arr.length - 1, arr, val));
				processed.add(val);
			}
		}
 
	}
 
	public static int solveRecursive(int start, int end, int[] arr, int element) {
		/* if start is greater than n, we need to return because this 
          represent a subarray of negative size.*/
		if (start > end) {
			return 0;
		}
 
		/* this means that the size of the virtual subarray is one, 
		 * and it has only single element. */
		if (start == end) {
			/* now if this single element is equal to the element 
			 * whose frequency we are finding out, 
			 * then it will contribute one for its total frequency 
			 * in the whole array. */
			if (arr[start] == element && arr[end] == element) {
				return 1;
			} else {
				return 0;
			}
		}
 
		/* if the virtual subarray is of size greater than one, 
		 * and the elements at start and at the end are equal, 
		 * this means that whole array consists of 
		 * that element only, as the array 
		 * we are working on is already sorted.*/
		if (arr[start] == element && arr[end] == element) {
			return (end - start + 1);
		}
 
		int mid = (start + end) / 2;
		/* call for left side virtual subarray */
		int leftResult = solveRecursive(start, mid, arr, element);
 
		/* call for right side virtual subarray.*/
		int rightResult = solveRecursive(mid + 1, end, arr, element);
 
		/* our result will be calculated in postorder, 
		 * which will be left side result 
		 * plus the right side sum.*/
		return leftResult + rightResult;
	}
}