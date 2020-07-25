package com.java8.Properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class Load_Prop_Within_Class_Path {
	String result = "";
	InputStream inputStream;
	
	public static void main(String[] args) throws IOException {
		Load_Prop_Within_Class_Path x = new Load_Prop_Within_Class_Path();
		String user = x.getPropValues();
		
	}
 
	public String getPropValues() throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "commcfg.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			String user = prop.getProperty("DEV");
//			String company1 = prop.getProperty("company1");
//			String company2 = prop.getProperty("company2");
//			String company3 = prop.getProperty("company3");
 
//			result = "Company List = " + company1 + ", " + company2 + ", " + company3;
//			System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
			System.out.println(user);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}