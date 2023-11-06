package com.findings;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HelperClass {
	private static HelperClass helperClass;
	private static WebDriver driver;
	
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;
		
	//constructor
	HelperClass(){
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;		
	}
	
	public static void setUpDriver() {
		if(helperClass==null) {
			helperClass = new HelperClass();			
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			
		}
		helperClass=null;
		
	}

}
