package com.priceline.testSteps;



import com.priceline.utilities.PageObjectHandler;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class DemoSteps extends PageObjectHandler{
	
	/*
	 * Demo test Steps 0001
	 * Arafat Mamun
	 * 8-11-2016
	 */
	/*
	public void demo001Steps(){
		demo().getDemoPageTitle();
	}
	*/
	
	@Before
    public void beforeScenario() {
		System.out.println("KICK BROWSER 1st Time");
		ConfigDrivers();
		System.out.println("Browser Configured");
    }
	
	@Given("^why multiple defination$")
	public void why_multiple_defination(){
		System.out.println("Running Test 1");
		demo().getDemoPageTitle();
	   
	}
}
