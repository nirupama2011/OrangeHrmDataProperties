package com.findings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	public WebElement passWord;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement login;
	
	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
	public WebElement HomePageTitle;
}
