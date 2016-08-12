/**
 * 
 */
package com.priceline.testSteps;

import com.priceline.utilities.PageObjectHandler;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

/**
 * @author arafatmamun
 *
 */
public class DemoStepsTwo extends PageObjectHandler{
	
	@Before
    public void beforeScenario() {
		System.out.println("KICK BROWSER 2nd Time");
		ConfigDrivers();
		System.out.println("Browser Configured");
    }
	
	@Given("^get title method test two$")
	public void get_title_method_test_two() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
