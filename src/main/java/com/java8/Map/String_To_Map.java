package com.java8.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class String_To_Map {

public static void main(String[] args) {
        
        String strSource = "11:Jack, 23:Emily, 31:Ryan, 56:John, 99:Maria";
        
        //new HashMap object
        Map<String, String> hMapData = new HashMap<String, String>();        
        //split the String by a comma
        String parts[] = strSource.split(",");       
        //iterate the parts and add them to a map
        for(String part : parts){            
            //split the employee data by : to get id and name
            String empdata[] = part.split(":");            
            String strId = empdata[0].trim();
            String strName = empdata[1].trim();            
            //add to map
            hMapData.put(strId, strName);
        }        
        System.out.println("String to HashMap: " + hMapData);
        
        // new HashMap with Java8
        Map<String, String> hMapData8 = Arrays.stream( strSource.split(",") )
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(s -> s[0].trim(), s -> s[1].trim()));
         
        System.out.println("String to HashMap: " + hMapData8);
    }
}