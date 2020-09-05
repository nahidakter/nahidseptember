package com.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MSNWeather extends Base{
	
	
	@Given("^the user wants to view NY weather$")
	public void the_user_wants_to_view_NY_weather() throws Throwable {
	   getdriver();
	   
	}

	@When("^the user clicks on NY weather$")
	public void the_user_clicks_on_NY_weather() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='q']")).sendKeys("weather ny"); 
	}

	@Then("^the user can view the NY weather$")
	public void the_user_can_view_the_NY_weather() throws Throwable {
	 driver.findElement(By.xpath("//input[@")).click();
	 
	 Assert.assertEquals(driver.getTitle(),"MSN Weather");
	}
	
	



}
