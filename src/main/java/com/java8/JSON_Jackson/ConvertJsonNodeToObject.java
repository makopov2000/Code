package com.java8.JSON_Jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonNodeToObject {

	public static void main(String[] args) throws IOException {
		 // JSON string
	    String json = "{\"name\":\"John Doe\",\"email\":\"john.doe@example.com\"," +
	            "\"roles\":[\"Member\",\"Admin\"],\"admin\":true}";

	    // create object mapper instance
	    ObjectMapper mapper = new ObjectMapper();

	    // convert JSON string to `JsonNode`
	    JsonNode node = mapper.readTree(json);

	    // convert `JsonNode` to `User` object
	    User user = mapper.treeToValue(node, User.class);

	    // print user object
	    System.out.println(user);

	}

}
