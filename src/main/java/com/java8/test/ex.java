package com.java8.test;

import java.util.ArrayList;
import java.util.List;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = oddNumbers(2,10);
		System.out.println(list);

	}
	
	public static List<Integer> oddNumbers(int l, int r) {
	    // Write your code here
	    List<Integer> list = new ArrayList<>();
	for (Integer i = l; i <= r; i++){
	    if (i%2 !=0 ){list.add(i);}
	}
	return list;
	    }

}
