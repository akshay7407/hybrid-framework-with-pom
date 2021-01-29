package com.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.BaseLayer.BaseClass;

public class WebEventListener extends BaseClass implements WebDriverEventListener {

	
	Logger log = Logger.getLogger(WebEventListener.class);
	
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {

		System.out.println("Before Navigating to : "+url);
		log.info("url is Started");
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {

		System.out.println("After Navigating to : "+url);
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("Trying to find element By : "+by.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("found Element By : "+by.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {

		System.out.println("Before clicking on Element "+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {

		System.out.println("After clicking on Element "+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		System.out.println("value of the: "+element.toString() +"before any change made");
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		System.out.println("Element value changed to: "+element.toString());
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		
		System.out.println("Before Switching to windows : "+windowName.toString());
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {

		System.out.println("After Switching to windows : "+windowName.toString());
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		
		System.out.println("Soft Tech classes Exception occured :"+throwable);
		
		try {
			TestUtil.ScreenShotCapture(System.currentTimeMillis());
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
		
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {

		System.out.println("Before Getting text :"+element.getText());
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {

		System.out.println("After Getting text :"+element.getText());
		
	}


	
}
