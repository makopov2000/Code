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
		
		
		StringTest cl = new StringTest();
//		cl.getName();
		Object c = cl.getClass();
		String x = cl.getClass().getName();
		System.out.println("Object: "+c);
		System.out.println("Name: "+x);

	}

	private   void getName() {
		System.out.println(getClass());
		
	}

}
