/**
 * 
 */
package com.priceline.testSteps;

import com.priceline.utilities.PageObjectHandler;

import cucumber.api.java.en.When;

/**
 * @author arafatmamun
 *
 */
public class TC_03_Steps extends PageObjectHandler{
	
	@When("^Click on Hotel link from Header$")
	public void clickOnHotelsLink(){
		header().clickOnHotelsLink();
	}
}
