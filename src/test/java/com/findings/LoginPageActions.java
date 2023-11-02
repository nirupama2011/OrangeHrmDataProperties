package com.findings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	LoginPageLocators lpl = new LoginPageLocators();
//	String strUserName, strPassword, strUrl;
	WebDriver driver;
	
	public LoginPageActions() {
		this.lpl = new LoginPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), lpl);
	}

	
	
	public void setUserName(String strUserName) {
		lpl.userName.sendKeys(strUserName);
	}
	
	//set password in textbox
	public void setPassword(String strPassword) {
		lpl.passWord.sendKeys(strPassword);
	}
	
	//set click
	public void clickLogin() {
		lpl.login.click();
	}
	
	public void login(String strUserName, String strPassword) {
		setUserName(strUserName);
		setPassword(strPassword);
//		clickLogin();
		
	
	}

}
