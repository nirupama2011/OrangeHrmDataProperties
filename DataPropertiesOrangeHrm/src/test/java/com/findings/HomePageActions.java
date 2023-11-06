package com.findings;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
HomePageLocator homepageLocators ;
	
	public HomePageActions(){
		homepageLocators = new HomePageLocator();
		
		PageFactory.initElements(HelperClass.getDriver(), homepageLocators);
	}
	
	public String getVerifyText() {
		return homepageLocators.verifyText.getText();
	}
}
