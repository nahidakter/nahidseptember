package com.careerhack.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="com.stepdefinition"
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}
