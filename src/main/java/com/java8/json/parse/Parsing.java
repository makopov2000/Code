package com.java8.json.parse;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

import org.apache.commons.collections.map.StaticBucketMap;

//import com.fasterxml.jackson.databind.PropertyNamingStrategy.KebabCaseStrategy;
import com.jcraft.jsch.SftpATTRS;

public class Parsing {

    static String[] array =  { "SEVEN:0.00013", "ALPHA:TWO", "LARRY:2LE" };
	static String array1 = "(+)AE,\r\n" + 
			"(+)SAECNT";
	static String array2 = "[(+)AE: % Subj Incidence: Site=100.0%; Study=97.5%; Avg Site Duration=244.0 days]," + 
			"[(+)SAECNT: Count/Subj adjusted by duration: Site=0.0; Country=0.7; Study=0.8]";
    
    
    public static HashMap<String, String> convertToMap(String [] someArray){
        HashMap<String,String> retMap = new HashMap<String, String>();
         
        for (String string : array) {
            String splitFirstValue = string.substring(0,string.indexOf(":"));
            String splitSeconSValue = string.substring(string.indexOf(":") + 1 ,string.length());
             
            retMap.put(splitFirstValue, splitSeconSValue);
        }
        return retMap;
    }
     
     
    public static void main(String[] args) throws Exception {
        HashMap<String,String> someMap = convertToMap(array);
//        System.out.println(someMap);
//        System.out.println(array2);
        String[] strings = array1.split(",");
        String[] strings2 = array2.split(",");
//        System.out.println(strings[0]);
//        System.out.println(strings[1]);
        System.out.println(strings2[0]);
        System.out.println(strings2[1]);
        
        String[] strings3 = strings2[0].split(":");
        System.out.println(strings3[2]);
        
        String[] strings4 = strings3[2].split(";");
        Arrays.stream(strings4).forEach(s -> System.out.println(s));
        Map<String, String> mapString = new HashMap<>();
        mapString = Arrays.stream(strings4)
        		.map(ele -> ele.split("="))
        		.filter(ele -> ele.length==2)
        		.collect(Collectors.toMap(e -> e[0], e -> e[1]));
        DecimalFormat df = new DecimalFormat("0.00");
        mapString.forEach((k, v)-> System.out.format("Map key: %s, value: %s.%n",k,v));
        
        String x = "199.333%";
        String z = x.replace("%","");
        Float float1 =Float.parseFloat(z);
        System.out.println("Z :"+z);
        System.out.println("Flot 1:"+float1);
//        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        System.out.println("Flot 2:" +df.format(float1));
        
        		
//        System.out.println(strings4[0]);
//        System.out.println(strings4[1]);
//        System.out.println(strings4[2]);
        
         
    }

}
