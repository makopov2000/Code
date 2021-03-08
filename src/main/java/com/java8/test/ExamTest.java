package com.java8.test;

import java.nio.file.*;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
//import java.nio.file.attribute.*;
//import static java.nio.file.FileVisitResult.*;
//import static java.nio.file.FileVisitOption.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.Instant;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.Clock;
import java.time.LocalTime;

import java.util.Date;
import java.util.Locale;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.Collections;
import java.util.Comparator;

import java.util.Properties;

import java.util.function.*;

import java.util.Base64;

import java.util.concurrent.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.StampedLock;
import java.util.concurrent.atomic.LongAccumulator;

public class ExamTest {
	static int count = 0;
	int i = 0;
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
		ExamTest n1 = new ExamTest();
		ExamTest n2 = new ExamTest();
		n1.changeCount();
		n2.changeCount();
		System.out.println(n1.count+" : "+n2.count);
		
		int a[] = {1,2,053,4};
		int b[][] = {{1,2,4},{2,2,1},{0,43,2}};
		
		System.out.println(a[3]==b[0][2]);
		System.out.println((a[2]==b[2][1]));
		
		//================================ String is Immutable but will change if "+" used
		String s = "Java";
		s.concat("SE7");
		s.replace("7", "");
		System.out.println(s);
		s+="Mike";
		System.out.println(s);
		
		//================================ List with different types
		List list = new ArrayList(1);
		list.add(5);
		list.add("Java");
		list.add(new Integer(3));
		System.out.println(list);
		
		//=============================
		Thread th = new Thread(new Runnable() {
			 {
				System.out.println("Init");
			}
			@Override
			public void run() {
				System.out.println("start-Run");
				
			}
			
		});
		th.start();
		//===========================
		Path p1 = Paths.get("/Pic/MyPic.jpeg");
		System.out.println(
				p1.getNameCount()
				+ ":"
				+ p1.getName(1)
				+ ":"
				+ p1.getFileName()
				);
				
		// ==========================
		List<String> strs = Arrays.asList("Java","Java EE","Java ME", "Angular");
		Predicate<String> sf1 = x->x.length()>3;
		Predicate sf2 = new CourseFilter() {
			public boolean test(String s) {
				return s.contains("Java");
//				return s.equals("Java");
			}
		};
		CourseFilter sf3 = new InterfaceImpl();
		
		long c = strs.stream()
				.filter(sf1)
//				.filter(sf2)
				.filter(v->sf3.test(v))
				.count();
		System.out.println(c);

		/////////////////
		System.out.println("========");
		List<Integer> num = Arrays.asList(10,20,8);
		System.out.println(num.stream()
				.mapToInt(v->v)
				.max());
		
		/////////////////////////
		Integer aa[] = {1,2,3,4,5};
		String bb[] = {"Mike","Inna", "Alex"};
		System.out.println(ExamTest.count(aa, 3));
		System.out.println(ExamTest.count(bb, "s"));
		////////////////////
		Eq a1 = new Eq("A");
		Eq a2 = new Eq("A");
		if (a1==a2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (a1.equals(a2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		////////////////////////////
		  final int y = 0;
		CourseFilter cf3 = new CourseFilter() {
			static final int c=0;
			void print(){System.out.println(y);;}
		};
 System.out.println(10%3);

	}
	public static <T extends Comparable<T>> int count(T[]array, T elem) {
		int count = 0;
		for (T e:array) if (e.compareTo(elem)>0)++count;
		return count;
	}

}

class InterfaceImpl implements CourseFilter{
	public void print() {}
}
class Eq {
	interface lamb{
		String count(String a);
		}
	private String s;
	public Eq(String in) {this.s = in;}
	public boolean equals(Object in) {
		if (getClass()!= in.getClass()) return false;
		Eq a = (Eq) in;
		boolean ret = this.s.equals(a.s);
		return ret;
	}
}


