package com.training.utilities;

import static com.training.utilities.Constants.APPLICATION_PROPERTIES;
import static com.training.utilities.Constants.FILE_SEPARATOR;
import static com.training.utilities.Constants.USER_DIR;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getproperty(String key) throws IOException {
		
		//String spath = "C:\\workspaces\\Sept2022\\TestNGSalesforceFrameWork\\properties\\application.properties";
		String spath = USER_DIR+FILE_SEPARATOR+APPLICATION_PROPERTIES;
		//fileInputStream
		FileInputStream fileput = new FileInputStream(spath);
		Properties prop = new Properties();
		prop.load(fileput);
		String value = prop.getProperty(key);
		return value;
	}

}
