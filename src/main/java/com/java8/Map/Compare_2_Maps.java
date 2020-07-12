package com.java8.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Compare_2_Maps {

public static void main(String[] args) {        
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();        
        hmap1.put(1, "One");
        hmap1.put(2, "Two");
        hmap1.put(3, "Three"); 
        HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();        
        hmap2.put(3, "Three");
        hmap2.put(1, "One");
        hmap2.put(2, "Two");
        
        /*
         * To compare two HashMaps, use the
         * equals method
         */
        //returns true as both HashMap objects have same mappings
        System.out.println("--- Compare Maps with 'equals' ---");
        System.out.println( hmap1.equals(hmap2) );
        /*
         * To compare HashMap keys, get all keys
         * of both the map using the keySet method and
         * then compare them using the equals method
         */
        //returns true
        System.out.println("--- Compare Maps with 'keySet equals' ---");
        System.out.println( hmap1.keySet().equals( hmap2.keySet() ) );
        
        /*
         * Get all map values using the values method,
         * convert them to a Set
         */
        Set<String> valueSet1 = new HashSet<String>( hmap1.values() );
        Set<String> valueSet2 = new HashSet<String>( hmap2.values() );
         
        //compare using Set.equals method
        System.out.println("--- Compare Maps with 'SET of values equals' ---");
        System.out.println( valueSet1.equals(valueSet2) );
        
        //////////////////////////////////////////////////////////////////REMOVE        
        //remove one mapping from the first map
        System.out.println("--- Removing entry  ---");
        hmap1.remove(2);
        
        ////////////////////////////////////////////////////////////////// Check again
        //returns false as both HashMap objects does not have same mappings
        System.out.println("--- Compare Maps with equals' ---");
        System.out.println( hmap1.equals(hmap2) );
 
        //returns false
        System.out.println("--- Compare Maps with 'keySet equals' ---");
        System.out.println( hmap1.keySet().equals( hmap2.keySet() ) );
        
        //compare using Set.equals method
        Set<String> valueSet3 = new HashSet<String>( hmap1.values() );
        Set<String> valueSet4 = new HashSet<String>( hmap2.values() );
        System.out.println("--- Compare Maps with 'SET of values equals' ---");
        System.out.println( valueSet3.equals(valueSet4) );
 
    }
}