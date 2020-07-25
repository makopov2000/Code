package com.java8.Compare2CustomObjects;

import java.io.IOException;

//import com.fasterxml.jackson.core.JsonGenerationException;
//import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MainCompareWithObjectMapper {

	public static void main(String[] args) throws Exception { 
		Person p1 = new Person("1", "Mike", "ABC");
		Person p2 = new Person("1", "Julia", "XYZ");
		Person p3 = new Person("1", "Mike", "ABC");
		
        // create the mapper
		ObjectMapper mapper = new ObjectMapper();
 
        // enable pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
//        // serialize the object
//        mapper.writeValue(System.out, p1);
//        mapper.writeValue(System.out, p2);
//        mapper.writeValue(System.out, p3);


		String per1 = mapper.writeValueAsString(p1);
		String per2 = mapper.writeValueAsString(p2);
		String per3 = mapper.writeValueAsString(p3);

		System.out.println(per1.equals(per2));

		System.out.println(per1.equals(per3)); 

	}
}