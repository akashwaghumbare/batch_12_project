package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() throws Exception {  // Constructor
		
		String path="C:\\Users\\Admin\\eclipse-workspace\\Akash_Project_FrameWork\\config\\Config.PropertiesFile";
 FileInputStream fis=new FileInputStream(path);
		
	    pro=new Properties();
		pro.load(fis);
		
	}
	
	public String FacebookUrl() {
		
	return pro.getProperty("FacebookUrl");
		
	}
	
}
