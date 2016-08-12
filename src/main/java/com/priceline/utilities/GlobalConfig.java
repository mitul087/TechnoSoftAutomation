package com.priceline.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.Before;


public abstract class GlobalConfig {
	
	public static WebDriver myDriver = null;
	private static String siteLink = "https://www.priceline.com/";
	
	/* File Paths */
	private static String fileSeparator = System.getProperty("file.separator");
	private static String currentDir = System.getProperty("user.dir");
	
	private static String chromeDriverPath = currentDir + fileSeparator + "macChromeDriver" + fileSeparator + "chromedriver";
	
	/* end of file paths*/
	@BeforeSuite
	public static void ConfigDrivers(){
		System.out.println("INITIALIZING DRIVER");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		myDriver = new ChromeDriver();
		//myDriver = new FirefoxDriver();
		myDriver.navigate().to( siteLink );
	}
	
	
	public static WebElement getElement(String locator, String attributeOfLocator){
		WebElement result = null;
		
		return result;
	}
	
	@AfterSuite
	public static void terminateDrivers(){
		
		myDriver.close();
		myDriver.quit();
	}
}
