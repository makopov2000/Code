package com.winterbe.java8.samples.util;

import org.jasypt.encryption.pbe.PBEStringEncryptor;

public class JasyptUtil {
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
        public static JasyptUtil getInstance(final String arKey){
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
