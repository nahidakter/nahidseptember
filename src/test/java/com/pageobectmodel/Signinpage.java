package com.pageobectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	 public WebDriver driver;
	 public Signinpage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
  @FindBy(xpath="//input[@id='ap_email']")
	public WebElement signin;
    public void getsignin() {
    	signin.click();
    }
    @FindBy(xpath="")
	public WebElement username;
    public void getusername() {
    
}
}
