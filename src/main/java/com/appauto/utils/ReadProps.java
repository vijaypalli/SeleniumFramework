package com.appauto.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProps {
	
	
	
	private ReadProps() {
		
	}
	
	public static String getValue(String key) {
		String propertyFilePath =System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
		FileInputStream file;
		Properties properties = new Properties();
		try {
			file = new FileInputStream(propertyFilePath);
			properties.load(file);
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key);
		
	}

}
