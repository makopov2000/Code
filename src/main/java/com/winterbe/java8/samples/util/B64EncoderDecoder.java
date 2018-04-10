package com.winterbe.java8.samples.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.Random;

public class B64EncoderDecoder {

    public static void main (String args[]) throws IOException {
        String passDec;
        String passEnc;
        String passDecNew;
        String passEncNew;

        passEnc = encode("mike");
        passDec = decode(passEnc);
        System.out.println("Encoded password: "+passEnc+" and it is decoded: "+passDec);

        passEncNew = encodeWithSalt("mike");
        passDecNew = decodeWithSalt(passEncNew);
        System.out.println("Encoded password with SALT: "+passEncNew+" and it is decoded: "+passDecNew);
    }

    public static Random random = new Random(new Date().getTime());

    public static String encode(String inputToDecode) {
        byte[] bytesEncoded = Base64.getEncoder().encode(inputToDecode.getBytes());
        return new String(bytesEncoded);
    }

    public static String decode(String inputToDecode) {
        byte[] bytesDecoded = Base64.getDecoder().decode(inputToDecode);
        return new String(bytesDecoded);
    }

    public static String encodeWithSalt(String inputToDecode) {
        BASE64Encoder encoder = new BASE64Encoder();
        //dummy salt
        byte[] salt = new byte[8];
        random.nextBytes(salt);
        return encoder.encode(salt)+encoder.encode(inputToDecode.getBytes());
    }

    public static String decodeWithSalt(String inputToDecode) throws IOException {
        //ignore salt
        if (inputToDecode.length() > 12) {
            String cipher = inputToDecode.substring(12);
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                return new String(decoder.decodeBuffer(cipher));
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
            }
        }
        return null;
    }
}
