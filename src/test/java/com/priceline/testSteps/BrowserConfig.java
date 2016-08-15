/**
 * 
 */
package com.priceline.testSteps;

import com.priceline.utilities.GlobalConfig;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author arafatmamun
 *
 */
public class BrowserConfig extends GlobalConfig{
	
	@Before
	public static void setUpBrowser(){
		ConfigDrivers();
	}
	
	
	@After
	public static void stopBrowser(){
		terminateDrivers();
	}
}
