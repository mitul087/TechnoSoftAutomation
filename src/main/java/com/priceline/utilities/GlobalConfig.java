package com.priceline.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class GlobalConfig {

	public static WebDriver myDriver = null;
	private static String siteLink = "https://www.priceline.com/";

	/* File Paths */
	private static String operatingSystem = System.getProperty("os.name");
	private static String fileSeparator = System.getProperty("file.separator"); 
	private static String currentDir = System.getProperty("user.dir");

	private static String chromeDriverPath = currentDir 
			+ fileSeparator
			+ "winChromeDriver" 
			+ fileSeparator 
			+ "chromedriver.exe";

	/* end of file paths */

	public static void ConfigDrivers() {
		System.out.println("INITIALIZING DRIVER");
		System.out.println(operatingSystem + " : " + chromeDriverPath);
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		myDriver = new ChromeDriver();
		//myDriver = new FirefoxDriver();
		myDriver.navigate().to(siteLink);
	}

	public static void terminateDrivers() {

		myDriver.close();
		myDriver.quit();
	}
}
