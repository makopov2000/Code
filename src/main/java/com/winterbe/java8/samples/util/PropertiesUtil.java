package com.winterbe.java8.samples.util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties properties = null;

    private PropertiesUtil() throws IOException {
        synchronized (PropertiesUtil.class) {
            properties = new Properties();
            properties.load(PropertiesUtil.class.getResourceAsStream("/application.property"));
        }
    }

    public static Properties getProperties() throws IOException {
        if (properties == null) {
            new PropertiesUtil();
        }
        return properties;
    }

    public static Properties readProperties(String env) throws IOException{
        Properties appProperties = new Properties();
        appProperties.load(PropertiesUtil.class.getResourceAsStream("/application_"+env+".properties"));
        return appProperties;
    }
}
