package com.java8.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class JsonObjectMapperCode {

    public JsonObjectMapperCode() throws JsonProcessingException {
    }

//    ObjectMapper objectMapper = new ObjectMapper();

//    client = getClient(url, "env");
//    reponse = client.execute(get);
//
//    Integer statusCode = reponse.getStatusLine().getStatusCode();
//    String statusExp = reponse.getStatusLine().getReasonPhrase();
//        if (statusCode != 200){
//        throw new RuntimeException(String.valueOf((statusCode)));
//    }
//
//    BufferedReader rd = new BufferedReader((new InputStreamReader((reponse.getEntity().getContent()))));
//    String line = new String();
//        while ((line = rd.readLine()) != null) {
//        responseString.append(line);
//    }

//        RestResponse restResponse;  //--->> create custom Object
//        restResponse.setResponseBody(responseString.toString());
//        restResponse.setResponseCode(reponse.getStatusLine().getStatusCode());
//        restResponse.setResponseMessage(reponse.getStatusLine().getReasonPhrase());
//        Header[] rheaders = reponse.getAllHeaders();
//        for (Header header : rheaders) {
//            restResponse.setHeader(header.getName(), header.getValue());
//        }


//    String jsonRespose = new String();
//    jsonRespose = restResponse.getResposeBody();

//    JSONObject jsonObject = objectMapper.readValues(jsonRespose, JSONObject.class);
//    LinkedHashMap<?, ?> linkedHashMap = (LinkedHashMap<?, ?>) jsonObject.get("cap_dtaiuls");
//    Assert.assertNotNull(linkedHashMap);
//    Assert.assertTrue(linkedHashMap.get("numer").equals(????))

//    JSONArray jsonArray = objectMapper.readValues(jsonRespose, JSONArray.class);
//    Assert.assertTrue(jsonArray.size() == 2);
//    String row1 = (String) jsonArray.get(0);
//    String row2 = (String) jsonArray.get(1);

//    String reqardResp = objectMapper.writeValueAsString(jsonArray);
//    Assert.assertTrue(reqardResp.contains("\\\"loyalty_acct\\\":\\\"1m12345\\\""));


}
