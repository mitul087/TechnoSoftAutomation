package com.priceline.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class GlobalConfig {
	
	public static WebDriver myDriver = null;
	private static String siteLink = "https://www.priceline.com/";
	
	/* File Paths */
	private static String operatingSystem = System.getProperty("os.name");
	private static String fileSeparator = System.getProperty("file.separator");
	private static String currentDir = System.getProperty("user.dir");
	
	private static String chromeDriverPath = currentDir + fileSeparator + "macChromeDriver" + fileSeparator + "chromedriver";
	/* end of file paths*/
	
	public static void ConfigDrivers(){
		System.out.println("INITIALIZING DRIVER");
		System.out.println(operatingSystem);
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		myDriver = new ChromeDriver();
		//myDriver = new FirefoxDriver();
		myDriver.navigate().to( siteLink );
	}
	
	
	public static WebElement getElement(String locator, String attributeOfLocator){
		WebElement result = null;
		
		return result;
	}
	
	public static void terminateDrivers(){
		
		myDriver.close();
		myDriver.quit();
	}
}
