package com.java8.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class String_Split {

	public static void main(String[] args) {
		String str1 = "123dance456";
		String substr1 = "dance";
		String before1 = str1.substring(0, str1.indexOf(substr1));
		String after1 = str1.substring(str1.indexOf(substr1) + substr1.length());
		
		System.out.println("Before1: "+before1);
		System.out.println("After1: "+after1);
		
		String str = "123dance456";
		String substr = "dance";
		String[] parts = str.split(substr);
		String before = parts[0];
		String after = parts[1];
		
		System.out.println("Before: "+before);
		System.out.println("After: "+after);
		
		String s1 = "amt_ltd_qty";
		String s2 = "amt_dly_qty";
		String s3 = "inv_ltd_qty";
		String s4 = "inv_dly_qty";
		String s5 = "prec_dly_qty";
		
		String ltd = "_ltd";
		String dly = "_dly";
		String delim = "|";
		
		String[] r1 = s1.split("_ltd|_dly");
		System.out.println(r1[0]);
		String[] r2 = s2.split("_ltd|_dly");
		System.out.println(r2[0]);
		String[] r3 = s3.split("_ltd|_dly");
		System.out.println(r3[0]);
		String[] r4 = s4.split("_ltd|_dly");
		
		System.out.println(s5.split(ltd+delim+dly)[0].toUpperCase());
		
		List<String> list = new ArrayList<>();
		Map<String,String> map = new HashMap<>();
	}

}
