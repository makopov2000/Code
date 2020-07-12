package com.java8.Map;

import java.util.HashMap;

public class If_Entry_Exist_in_Map {

public static void main(String[] args) {
        
        HashMap<Integer, String> hMapNumbers = new HashMap<Integer, String>();
        
        //add key-value pairs
        hMapNumbers.put(1, "One");
        hMapNumbers.put(2, "Two");
        hMapNumbers.put(3, "Three");
        hMapNumbers.put(4, null);
        
        ///////////////////////////////////////////////// If Key Exist
        //this will return "Two"
        String value = hMapNumbers.get( 2 );
        if( value == null )
            System.out.println("Key does not exist");
        else
            System.out.println("Key exists");
        ///
        boolean keyExists = hMapNumbers.containsKey( 2 );
        if( keyExists )
            System.out.println("Check with 'containsKey' == >> Key exists");
        else
            System.out.println("Key does not exist");
        
        /*
         * This will return null, as the HashMap does not have
         * the mapping for key 5 
         */
        value = hMapNumbers.get( 5 );
        if( value == null )
            System.out.println("Key does not exist");
        else
            System.out.println("Key exists");
        
        ///////////////////////////////////////////////// NULL value will return NOT EXIST too
        value = hMapNumbers.get( 4 );
        if( value == null )
            System.out.println("If VALUE=NULL message ==> Key does not exist");
        else
            System.out.println("Key exists");
        ///
        boolean keyExists1 = hMapNumbers.containsKey( 4 );
        if( keyExists1 )
            System.out.println("Check with 'containsKey' even VALUE==NULL >> Key exists");
        else
            System.out.println("Key does not exist");
        ///////////////////////////////////////////////////// If Value Exist
        
        
    }
}