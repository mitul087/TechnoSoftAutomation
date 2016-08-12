package com.priceline.testSteps;


import com.priceline.utilities.PageObjectHandler;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

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
	
	@Given("^get title method test$")
	public void get_title_method_test(){
		System.out.println("Its Here");
		demo().getDemoPageTitle();
	   
	}
}
