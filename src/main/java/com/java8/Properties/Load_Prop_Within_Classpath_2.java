package com.java8.Properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Load_Prop_Within_Classpath_2 {

	   private Properties prop = null;
	     
	    public Load_Prop_Within_Classpath_2(){
	         
	        InputStream is = null;
	        try {
	            this.prop = new Properties();
	            is = this.getClass().getClassLoader().getResourceAsStream("commcfg.properties");
	            prop.load(is);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	     
	    public String getPropertyValue(String key){
	        return this.prop.getProperty(key);
	    }
	     
	    public static void main(String a[]){
	         
	    	Load_Prop_Within_Classpath_2 mpc = new Load_Prop_Within_Classpath_2();
	        System.out.println("db.host: "+mpc.getPropertyValue("DEV"));
//	        System.out.println("db.user: "+mpc.getPropertyValue("db.user"));
//	        System.out.println("db.password: "+mpc.getPropertyValue("db.password"));
	    }
	}