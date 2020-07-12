package com.java8.Map;

import java.util.HashMap;

public class Empty_Size_Clear_Map {

public static void main(String[] args) {
        
        //create new HashMap
        HashMap<String, String> hMapColors = new HashMap<String, String>();
        
        //get the size using the size method
        System.out.println("Size is: " + hMapColors.size());
        System.out.println("is empty? " + hMapColors.isEmpty() );
        
        //add some key-value mappings
        hMapColors.put("1", "Red");
        hMapColors.put("2", "Green");
        hMapColors.put("3", "Blue");
        
        System.out.println("HashMap contains " + hMapColors.size() + " mappings");
        System.out.println("is empty? " + hMapColors.isEmpty() );
        
        hMapColors.clear();
        System.out.println("After Cleared Size is: " + hMapColors.size());
        System.out.println("After Cleared is empty? " + hMapColors.isEmpty() );
    }
    
}