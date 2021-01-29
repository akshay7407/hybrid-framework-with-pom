package com.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.Utils.TestUtil;
import com.Utils.WebEventListener;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver e_driver;
	public static Logger Log;


	public BaseClass() {

		Log = Logger.getLogger(this.getClass());
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\L470_1\\Desktop\\Automation Testing 21Nov Batch\\framework\\FreeCRMHybridFramework\\src\\main\\java\\com\\Configuration\\config.properties");
			prop.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@BeforeClass
	public void setLog4j()
	{
		TestUtil.setDateForLog4j();
	}
	
	public static void Intiliazation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\L470_1\\Desktop\\Automation Testing 21Nov Batch\\framework\\FreeCRMHybridFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// we have define this class in Util Package
		eventListener= new WebEventListener();
		// we crating object of EventDFiringWebDriver by passing webdriver instance/ Object
		e_driver= new EventFiringWebDriver(driver);
		// under the EventFiringWebdriver there is one method Register 
		// so have register created in class utils with EventFiring WebDriver 
		e_driver.register(eventListener);
		
		// 
		//driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

	
	@AfterClass
	public void endReport() throws IOException
	{
		
	
	}
	
	
}
