package com.priceline.testSteps;

import com.priceline.utilities.GlobalConfig;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author arafatmamun
 *
 */
public class BrowserConfig extends GlobalConfig {

	private static String webUrl = "https://www.priceline.com/";
	
	@Before
	public void setUpBrowser() throws Exception {
		
		instantiateDriverObject();

		WebDriver driver = getDriver();
		driver.get(webUrl);

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

	}

	@After
	public static void stopBrowser() {
		closeDriverObjects();
	}
}