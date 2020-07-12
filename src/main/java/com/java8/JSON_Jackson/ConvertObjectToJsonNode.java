package com.java8.JSON_Jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectToJsonNode {
	
	public static void main (String[] args) throws JsonGenerationException,  JsonMappingException, IOException {
		 Employee employee = new Employee();
	        employee.setId(1001);
	        employee.setName("Drona");
	        employee.setAge(25);
	        employee.setDesignation("Manager");
	        Compensation compensation = new Compensation();
	        compensation.setCurrency('$');
	        compensation.setSalary(30000);        
	        employee.setCompensation(compensation);
	        
	        ObjectMapper mapper = new ObjectMapper();
	        
	        // convert user object to `JsonNode`
//	        JsonNode node = mapper.convertValue(employee, JsonNode.class);
	        JsonNode node = mapper.valueToTree(employee);
	        
	        // print JSON nodes
	        System.out.println(node.path("id").asText());
	        System.out.println(node.path("name").asText());
	        System.out.println(node.path("age").asText());
	        System.out.println(node.path("designation").asText());
	        System.out.println(node.get("compensation").path("currency").asText());
	        System.out.println(node.get("compensation").path("salary").asText());
//	        System.out.println(node.path("compensation").get(0).asText());
	}

}
