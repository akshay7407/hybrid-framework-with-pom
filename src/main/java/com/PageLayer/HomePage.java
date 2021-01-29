package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	//POm with page Factory
	
	@FindBy(xpath=".//*[@id='top-header-menu']/div[1]")
	WebElement CheckImageStatus;
	
	@FindBy(xpath="//a[@href")
	WebElement DealsStatus;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateTitle() {
		String actualitle=driver.getTitle();
		return actualitle;
	}
	
	public boolean checkDisplayStatus() {
		boolean ImageStatus=CheckImageStatus.isDisplayed();
		return ImageStatus;
	}
	
	public boolean checkDealsStatus() {
		boolean status=DealsStatus.isDisplayed();
		//Assert.assertEquals(12, 13);
		
		return status;
	}
	
}
