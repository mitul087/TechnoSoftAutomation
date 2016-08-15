/**
 * 
 */
package com.priceline.testSteps;


import com.priceline.utilities.GlobalConfig;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

/**
 * @author arafatmamun
 *
 */
public class BrowserConfig extends GlobalConfig{
	
	@Before
    public void beforeScenario() {
		System.out.println("KICK BROWSER 1st Time");
		ConfigDrivers();
		System.out.println("Browser Configured");
    }
	@After
	public void afterScenario(){
		System.out.println("Terminating BROWSER");
		terminateDrivers();
	}
	
	
}
