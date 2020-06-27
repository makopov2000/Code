package com.java8.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDE";
		String s2 = "BCD";
		boolean m = s1.contains(s2);
		System.out.println("Boolean: "+m); 
		System.out.println(s1.contains(s2)); 
		System.out.println(s1.indexOf(s2));

	}

}
