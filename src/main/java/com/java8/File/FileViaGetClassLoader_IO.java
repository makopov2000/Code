package com.java8.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileViaGetClassLoader_IO {

	   public static void main(String[] args) throws IOException {

		   FileViaGetClassLoader_IO main = new FileViaGetClassLoader_IO();
	        File file = main.getFileFromResources("C:\\Java Lib\\Code\\src\\main\\java\\com\\example\\unix\\file\\commcfg.properties");

	        printFile(file);
	    }

	    // get file from classpath, resources folder
	    private File getFileFromResources(String fileName) {

	        ClassLoader classLoader = getClass().getClassLoader();

	        URL resource = classLoader.getResource(fileName);
	        if (resource == null) {
	            throw new IllegalArgumentException("file is not found!");
	        } else {
	            return new File(resource.getFile());
	        }

	    }

	    private static void printFile(File file) throws IOException {

	        if (file == null) return;

	        try (FileReader reader = new FileReader(file);
	             BufferedReader br = new BufferedReader(reader)) {

	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        }
	    }

	}