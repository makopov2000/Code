package com.java8.Interfaces;

public interface Compare_Arrays {
	public static <T extends Comparable<T>> int count(T[]array, T elem) {
		int count = 0;
		for (T e:array) if (e.compareTo(elem)>0)++count;
		return count;
	}

}
