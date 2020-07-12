package com.java8.JSON_Jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
 
public class DeserializationExample {
 
    public static void main(String[] args) throws JsonGenerationException,
            JsonMappingException, IOException {
        
        // create the mapper
        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        // de-serialize JSON to object
        Employee employee = mapper.readValue(getEmployeeJson(), Employee.class);
        
        // print the de-serialized object 
        System.out.println(employee);
    }
 
    static String getEmployeeJson() {
        return "{                                 " +
                "    \"id\" : 1001,                 " +
                "    \"name\" : \"Drona\",          " +
                "    \"age\" : 25,                  " +
                "    \"designation\" : \"Manager\", " +
                "    \"compensation\" : {           " +
                "        \"currency\" : \"$\",      " +
                "        \"salary\" : 30000         " +
                "    }                              " +
                "}                                 ";
    }
}