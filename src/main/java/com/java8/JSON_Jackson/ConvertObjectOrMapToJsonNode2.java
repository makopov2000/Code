package com.java8.JSON_Jackson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectOrMapToJsonNode2 {
	
	public static void main (String[] args) throws JsonGenerationException,  JsonMappingException, IOException {
		 /////////////////////////////// create user object /////////////////////////////////////
	    User user = new User("John Doe", "john.doe@example.com",
	            new String[]{"Member", "Admin"}, true);

	    // create object mapper instance
	    ObjectMapper mapper = new ObjectMapper();

	    // convert user object to `JsonNode`
	    JsonNode node = mapper.valueToTree(user);

	    // print JSON nodes
	    System.out.println(node.path("name").asText());
	    System.out.println(node.path("email").asText());
	    System.out.println(node.path("roles").get(0).asText());
	    System.out.println(node.path("roles").get(1).asText());
	    
	 //////////////////////// create a map ///////////////////////////
	    Map<String, Object> map = new HashMap<>();
	    map.put("name", "John Deo");
	    map.put("email", "john.doe@example.com");
	    map.put("roles", new String[]{"Member", "Admin"});
	    map.put("admin", true);

	    // convert map to `JsonNode`
	    JsonNode nodeFromMap = mapper.convertValue(map, JsonNode.class);

	    // print JSON nodes
	    System.out.println(nodeFromMap.path("name").asText());
	    System.out.println(nodeFromMap.path("email").asText());
	    System.out.println(nodeFromMap.path("roles").get(0).asText());
	}

}
