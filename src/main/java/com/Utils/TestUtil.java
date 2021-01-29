package com.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;

public class TestUtil extends BaseClass{
	
	
	
	public static void ScreenShotCapture(long l) throws IOException {
	
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String screenShot=System.getProperty("user.dir");
		FileUtils.copyFile(f, new File(screenShot +"/Screenshots/"+ l+".jpg"));
		
	}
	
	//Set Date For Log4J.
		public static void setDateForLog4j()
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("_ddMMyyyy_HHmmss");
			System.setProperty("current_date", dateFormat.format(new Date()));
			PropertyConfigurator.configure("./src/main/resource/log4j.properties");
		}

	

}
