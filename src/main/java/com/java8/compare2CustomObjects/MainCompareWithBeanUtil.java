package com.java8.compare2CustomObjects;

public class MainCompareWithBeanUtil {
	public static void main (String[] args) throws Exception , CloneNotSupportedException{
	      Person p1 = new Person("1", "Mike", "ABC");
	      Person p2 = new Person("1", "Julia", "XYZ");
	      Person p3 = new Person("1", "Mike", "ABC");

	      boolean b = BeanUtil.haveSamePropertyValues(Person.class, p1, p2);
	      System.out.println(b);

	      b = BeanUtil.haveSamePropertyValues(Person.class, p1, p3);
	      System.out.println(b);
	  
	  }
	}