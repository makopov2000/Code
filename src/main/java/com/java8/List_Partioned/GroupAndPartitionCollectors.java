package com.java8.List_Partioned;

import java.util.stream.*;

import java.util.*;
public class GroupAndPartitionCollectors {
	private static List<MusicalInstrument> musicalInstruments=new ArrayList<>();
	static {
		musicalInstruments.add(new MusicalInstrument("Trumpet","brass",299.99));
		musicalInstruments.add(new MusicalInstrument("Tuba","brass",1149.0));
		musicalInstruments.add(new MusicalInstrument("Timpani","percussion",2339.0));
		musicalInstruments.add(new MusicalInstrument("Snare drum","percussion",325.00));
		musicalInstruments.add(new MusicalInstrument("Piano","keyboard",5179.99));
		musicalInstruments.add(new MusicalInstrument("Trombone","brass",775.79));
	}
	public static void main (String args[]) {
//		System.out.println("Musical instruments in the collection:");
//		musicalInstruments
//		.stream()
//		.forEach(instrument->System.out.println(instrument) );
		
		System.out.println("Group by type");
		System.out.println("------------------------");
//		Map > typeMap= musicalInstruments
		Map<String, List<MusicalInstrument>> typeMap= (Map<String, List<MusicalInstrument>>) musicalInstruments
		.stream()
		.collect(Collectors.groupingBy(MusicalInstrument::getType));
		
		typeMap.forEach((k, v)->{
			System.out.println("Key: " + k);
			v.forEach(val -> System.out.println("Value: "+val));
		});
		
		System.out.println("");
		System.out.println("Partition by Affordable (less than or equal to $500) or Expensive (greater than $500)");
		System.out.println("------------------------");
		Map<Boolean, List<MusicalInstrument>> priceMap= musicalInstruments
		.stream()
		.collect(Collectors.partitioningBy(musicalInstrument -> musicalInstrument.getPrice() > 500.0));
		
		priceMap.forEach( (key, value)-> {
					System.out.println((key? "Expensive ":"Affordable")); 
					value.forEach(System.out::println);
					});
		
		System.out.println("");
		System.out.println("------------------------");
		priceMap.forEach((k, v)->{
			System.out.println("Key: " + k);
			v.forEach(val -> System.out.println("Value: "+val));
		});
	}
}
