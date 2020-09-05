package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		
		 WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'Shoes')])[1]")).click();
	
			
			
		//Select all =new Select (driver.findElement(By.xpath("//select[@id='gh-cat']")));
	   // all.selectByVisibleText("Baby");
		//List<WebElement>l=all.getOptions();
		//System.out.println(l.size());
		//for (int i=0;i<l.size();i++) {
			//String t=l.get(i).getText();
			//System.out.println(t);
		//} 
	}
}
	
	


