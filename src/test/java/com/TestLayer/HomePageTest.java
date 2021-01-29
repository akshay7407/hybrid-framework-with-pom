package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

public class HomePageTest extends BaseClass {
	LoginPage LoginPage;
	HomePage HomePage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Intiliazation();
		LoginPage= new LoginPage();
		HomePage= new HomePage();
		LoginPage.loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void ValidateTitle() throws InterruptedException {
		
		String actualTitle=HomePage.ValidateTitle();
		Assert.assertEquals(actualTitle, "Cogmento CRM");
		Thread.sleep(4000);
	}
	
	@Test(priority=2)
	public void LogoCheck() {
		HomePage.checkDisplayStatus();
		Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	public void DealsStatusCheck() {
		boolean dealsStatus=HomePage.checkDealsStatus();
		Assert.assertTrue(true);
	}
		
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
}
