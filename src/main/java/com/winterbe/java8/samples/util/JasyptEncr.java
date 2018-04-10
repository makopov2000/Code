package com.winterbe.java8.samples.util;

import javafx.beans.property.Property;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.jasypt.encryption.pbe.PBEStringEncryptor;

public class JasyptEncr {
    private static InputStream inputStream;


    public String getPasswordDecrypt(String env){
        String passwordDecrypted = JasyptUtil.getInstance(readPropertyFile("env").getProperty("jasyptKey"))
                .decrypt(readPropertyFile("env").getProperty("password"));
        return passwordDecrypted;
    }


    public Properties readPropertyFile(String env){
        Properties properties = new Properties();
        inputStream = this.getClass().getClassLoader().getResourceAsStream(env);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


    public static class JasyptUtil {
        private static PBEStringEncryptor encryptor;
        private static String key;
        private static JasyptUtil jasyptUtil = null;

        private JasyptUtil(final String argKey){
            key = argKey;
            encryptor = new PBEStringEncryptor() {
                @Override
                public void setPassword(String s) {

                }

                @Override
                public String encrypt(String s) {
                    return null;
                }

                @Override
                public String decrypt(String s) {
                    return null;
                }
            };
            encryptor.setPassword(key);
        }
        public static JasyptUtil getInstance( final String arKey){
            if (arKey == null) {
                throw new RuntimeException("Jasypt Key not provided");
            }
            if (jasyptUtil == null) {
                jasyptUtil = new JasyptUtil(arKey);
            }
             return jasyptUtil;
        }
        public String decrypt(final String input) { return encryptor.decrypt(input);}
        public String encrypt(final String input) { return encryptor.encrypt(input);}
    }
}
