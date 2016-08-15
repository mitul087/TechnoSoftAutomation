package com.priceline.testSteps;





import com.priceline.utilities.PageObjectHandler;

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
	
	
	
	@Given("^why multiple defination$")
	public void why_multiple_defination(){
		System.out.println("Demo Step One");
		demo().getDemoPageTitle();
	   
	}
	
	
}
