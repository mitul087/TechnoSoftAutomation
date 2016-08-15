/**
 * 
 */
package com.priceline.testSteps;

import com.priceline.utilities.PageObjectHandler;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


/**
 * @author arafatmamun
 *
 */
public class DemoStepsTwo extends PageObjectHandler{
	
	
	
	@Given("^good its working$")
	public void good_its_working() throws Exception {
		System.out.println("Running TEST Two");
		demo().getDemoPageTitleTwo();
	}
	
	
}
