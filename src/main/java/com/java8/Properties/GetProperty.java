package com.java8.Properties;

import java.io.InputStream;
import java.util.Properties;

public class GetProperty {

	private static Properties properties = new Properties();

    protected static final String PROPERTY_FILE = "commcfg.properties";

//    // Load properties:
//
//          static
//
//          {
//
//                try
//
//                {
//
//                      InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(PROPERTY_FILE);
//
//                      properties.load(in);
//
//                }
//
//                catch (Throwable e)
//
//                {
//
//                      throw new ExceptionInInitializerError(e);
//
//                }
//
//          }
	
	public static void main(String[] args) {
		load();
		String commCfg = properties.getProperty("*");
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
