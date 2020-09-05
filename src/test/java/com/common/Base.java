package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;   
	
	public WebDriver getdriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.msn.com/en-us/weather");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
		
		return driver;
		
	}


	
	
}
