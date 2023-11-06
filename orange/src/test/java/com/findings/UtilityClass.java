package com.findings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	String strUsername;
	String strPassword;
	String strUrl;
	
	public UtilityClass() {
		this.logins();
	}
	
	
	public void logins() {
		File file = new File("C:\\Users\\nselvam2\\eclipse-workspace\\DataPropertiesOrangeHrm\\src\\test\\resources\\Properties\\dats.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		
		Properties property = new Properties();
		
		try {
			property.load(fileInput);
		} catch(IOException e) {
			e.printStackTrace();
		}
		 strUrl = property.getProperty("url");
		 strUsername = property.getProperty("username1");
		 strPassword = property.getProperty("password1");
		
	}
}
