package com.findings;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\nselvam2\\eclipse-workspace\\DataPropertiesOrangeHrm\\src\\test\\resources\\Properties\\Logins.feature", glue ="com.findings", plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class RunnerClass {

}
