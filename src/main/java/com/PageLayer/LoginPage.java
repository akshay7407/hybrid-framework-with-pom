package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	//POM with Page factory
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='password']/following::div[contains(text(),'Login')][1]")
	WebElement clickOnsubmit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String uname, String pwd) throws InterruptedException {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		clickOnsubmit.click();
	
	}
	
	
	
	
}
