package com.java8.comparator;

import java.security.PublicKey;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.CompareToBuilder;

public class Test {
	private static List<WalmartCahs> cash = new ArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	  addEntry(1,"ONE", new Timestamp(System.currentTimeMillis()));
	  Thread.currentThread().sleep(1000);;
	  addEntry(2,"Two", new Timestamp(System.currentTimeMillis()));	  
	  Thread.currentThread().sleep(1000);;
	  updateEntry(1,"Latest", new Timestamp(System.currentTimeMillis()));	
	  Thread.currentThread().sleep(1000);;
	  addEntry(3,"Tree", new Timestamp(System.currentTimeMillis()));	  
	  cash.stream().forEach(r -> System.out.println(r));	
	}
	private static void updateEntry(int i, String string, Timestamp date) throws InterruptedException {
		// TODO Auto-generated method stub
		for(WalmartCahs rec : cash) {
			if(rec.getKey().equals(i)) {
				rec.setStamp(date);
				rec.setVslue(string);
			}
		}	
	}
	private static void addEntry(int i, String string, Timestamp date) throws InterruptedException {
		Collections.sort(cash, new Comparator<WalmartCahs>() {
			@Override
			public int compare(WalmartCahs o1, WalmartCahs o2) {
				return new CompareToBuilder()
						.append(o1.getStamp(), o2.getStamp())
						.toComparison();
			}
		});
		
		Integer sz = (int) cash.stream().count();
		
		if (sz > 1) {
			cash.remove(0);
		}
		
		WalmartCahs rec = new WalmartCahs();
		rec.setKey(i);
		rec.setStamp(date);
		rec.setVslue(string);
		
		cash.add(rec);
	}
	

}
