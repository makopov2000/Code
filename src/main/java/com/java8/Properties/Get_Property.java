package com.java8.Properties;

import java.io.InputStream;
import java.util.Properties;

public class Get_Property {

	private static Properties properties = new Properties();

    protected static final String PROPERTY_FILE = "commcfg.properties";
	
	public static void main(String[] args) {
		load();
		String commCfg = properties.getProperty("DEV");
		System.out.println(commCfg);

	}

	private static void load() {

              try

              {

                    InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(PROPERTY_FILE);

                    properties.load(in);

              }

              catch (Throwable e)

              {

                    throw new ExceptionInInitializerError(e);

              }

        
		
	}

}
