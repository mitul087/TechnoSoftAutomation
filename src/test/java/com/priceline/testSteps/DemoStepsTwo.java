/**
 * 
 */
package com.priceline.testSteps;

import com.priceline.utilities.PageObjectHandler;

import cucumber.api.java.en.Given;


/**
 * @author arafatmamun
 *
 */
public class DemoStepsTwo extends PageObjectHandler{
	
	/*@Before
    public void beforeScenario() {
		System.out.println("KICK BROWSER 2nd Time");
		ConfigDrivers();
		System.out.println("Browser Configured");
    }*/
	
	@Given("^good its working$")
	public void good_its_working() throws Exception {
		System.out.println("Running TEST Two");
		demo().getDemoPageTitleTwo();
	}

}
