package com.java8.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.List_2.Entity.User;

/**
 * @author Benjamin Winterberg
 */
public class Sorted {

    public static void main(String[] args) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");


        // sorting

        stringCollection
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println(stringCollection);
        
        ////////////////////////////////////////////////////
        List<User> users = new ArrayList<>();
		List<User> sortedUsers = users.stream()
				  .sorted(Comparator.comparing(User::getCreatedOn))
				  .collect(Collectors.toList());
		List<User> sortedUsers2 = users.stream()
				  .sorted(Comparator.comparing(User::getCreatedOn).reversed())
				  .collect(Collectors.toList());

        

    }

}
