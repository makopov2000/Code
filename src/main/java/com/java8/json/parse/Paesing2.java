package com.java8.json.parse;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Paesing2 {
	static String array2 = 
			"% of Underdose: Site=0.0%; Study=10.4%; 0 subjects were underdosed (<74.8%); 0 subjects extreme outlier (<59.6%);% of TargetDose : Site= 68.0%; Study=100.0%";
 
	public static void main(String[] args) {
		String[] string1 = array2.split(";%");
		String[] string2 = string1[0].split(":");
//		Arrays.stream(string1).forEach(str -> System.out.println(str));
//System.out.println(string2[0]);
//System.out.println(string2[1]);
String[] string3 = string2[1].split("=");
Arrays.stream(string3).forEach(z -> System.out.println(z));
System.out.println("-------");
Map<String, String> mapString = new HashMap<>();
mapString = Arrays.stream(string3)
		.map(ele -> ele.split("="))
		.filter(ele -> ele.length==2)
		.collect(Collectors.toMap(e -> e[0], e -> e[1]));
//DecimalFormat df = new DecimalFormat("0.00");
mapString.forEach((k, v)-> System.out.format("Map For Each - key: %s, value: %s.%n",k,v));
		
		
//        String[] strings2 = array2.split(",");
//        String[] strings3 = strings2[0].split(":");
//        String[] strings4 = strings3[2].split(";");
//        Arrays.stream(strings4).forEach(s -> System.out.println("For Each Array: "+s));
//        Map<String, String> mapString = new HashMap<>();
//        mapString = Arrays.stream(strings4)
//        		.map(ele -> ele.split("="))
//        		.filter(ele -> ele.length==2)
//        		.collect(Collectors.toMap(e -> e[0], e -> e[1]));
//        DecimalFormat df = new DecimalFormat("0.00");
//        mapString.forEach((k, v)-> System.out.format("Map For Each - key: %s, value: %s.%n",k,v));

	}

}
