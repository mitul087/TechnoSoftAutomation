package com.priceline.testSteps;

import com.priceline.utilities.PageObjectHandler;

import cucumber.api.java.en.When;

public class TC_04_Steps extends PageObjectHandler {
	
	@When ("^Mouse Hover on header link My Trips$")
	public void clickOnMyTripsLink(){
		System.out.println("clickOnMyTripsLink");
		myTripsLink().hoverOnMyTrips();
	}
	
	@When ("^click on Track your flight status$")
	public void clickOnTrackFlightStatus(){
		myTripsLink().clickOnTrackMyFlight();
	}

}
