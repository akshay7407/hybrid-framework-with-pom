package com.TestLayer;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends BaseClass{
	LoginPage LoginPage;
	
	@BeforeMethod
	public void SetUp() {
		Intiliazation();
		LoginPage= new LoginPage();
	
		Log.info("application is lunched");
		
	}
	
	@Test
	public void ValidateLogin() throws InterruptedException {
		
		LoginPage.loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
		
		Log.info("Sucessfully lunched to Home page");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		Log.info("broser closed sucessfullly");
	}
	
	
}
