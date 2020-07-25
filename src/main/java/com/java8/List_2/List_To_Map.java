package com.java8.List_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.List_2.Entity.Animal;

public class List_To_Map {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
		list.add(new Animal(1, "dog"));
		list.add(new Animal(2, "cat"));
	    Map<Integer, Animal> map = convertListBeforeJava8(list);
	    map.forEach((k,v)->System.out.println(k+":"+v));;
	    
	    Map<Integer, Animal> map8 = convertListAfterJava8(list);
	    map8.forEach((k,v)->System.out.println(k+":"+v));;

	}
	
	public static Map<Integer, Animal> convertListBeforeJava8(List<Animal> list) {
	    Map<Integer, Animal> map = new HashMap<>();
	    for (Animal animal : list) {
	        map.put(animal.getId(), animal);
	    }
	    return map;
	}
	
	 public static Map<Integer, Animal> convertListAfterJava8(List<Animal> list) {
		    Map<Integer, Animal> map = list.stream()
		      .collect(Collectors.toMap(Animal::getId, animal -> animal));
		    return map;
		}

}
