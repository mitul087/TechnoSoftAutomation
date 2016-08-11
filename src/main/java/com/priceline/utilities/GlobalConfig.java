package com.priceline.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public abstract class GlobalConfig {
	
	public static WebDriver myDriver = null;
	private static String siteLink = "https://www.priceline.com/";
	
	@BeforeTest
	public static void ConfigDriver(){
		myDriver = new FirefoxDriver();
		myDriver.navigate().to( siteLink );
	}
	
	
	public static WebElement getElement(String locator, String attributeOfLocator){
		WebElement result = null;
		
		return result;
	}
}
