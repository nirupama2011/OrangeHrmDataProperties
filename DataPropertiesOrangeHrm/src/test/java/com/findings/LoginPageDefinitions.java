package com.findings;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
	
	LoginPageActions objLoginAction = new LoginPageActions();
	UtilityClass uti = new UtilityClass();
	HomePageActions objHome = new HomePageActions();
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.out.println("In login page...");
	    HelperClass.openPage(uti.strUrl);
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("Enter username and password: ");
		objLoginAction.login(uti.strUsername, uti.strPassword);
	}

	@When("User Clicks login button in login page")
	public void user_clicks_login_button_in_login_page() {
		System.out.println("Clicks loginn button");
	    objLoginAction.clickLogin();
	}

	@Then("User should be able to login successfully and navigates to the dashboard page")
	public void user_should_be_able_to_login_successfully_and_navigates_to_the_dashboard_page() {
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		   System.out.println("sucessfull login");
	}


//	@Given("User is on Login Page")
//	public void user_is_on_login_page() {
//		System.out.println("In login page...");
//	    HelperClass.openPage(uti.strUrl);
//	}
//	@When("User enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//		System.out.println("Enter username and password: ");
//		objLoginAction.login(uti.strUsername, uti.strPassword);
//	}
//	@When("User Clicks login button in login page")
//	public void user_clicks_login_button_in_login_page() {
//		System.out.println("Clicks loginn button");
//	    objLoginAction.clickLogin();
//	}
//	@Then("User should be able to login successfully and navigates to the dashboard page")
//	public void user_should_be_able_to_login_successfully_and_navigates_to_the_dashboard_page() {
//		System.out.println("Login is successful");
	}



	


	

	
	
	


	    

