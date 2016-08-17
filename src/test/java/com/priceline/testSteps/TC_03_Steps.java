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
	
	@When("^Enter \"([^\"]*)\" as valid City$")
	public void enterCityName(String cityName) throws InterruptedException{
		hotelsLanding().enterCityName(cityName);

	}
	
	@When("^Click on check in field$")
	public void clickOnCheckInField(){
		hotelsLanding().clickOnCheckInField( );
	}
	
	@When("^Select \"([^\"]*)\" as Check-in Date$")
	public void selectCheckInDate(String checkInDate){
		hotelsLanding().selectCheckInDate(checkInDate);
	}
	@When("^Click on check out field$")
	public void click_on_check_out_field(){
		hotelsLanding().clickOncheckOutField();
	    
	}

	@When("^Select \"([^\"]*)\" as Check-out Date$")
	public void selectCheckOutDate(String checkOutDate){
		hotelsLanding().selectCheckOutDate(checkOutDate);
	}

	@When("^Click on rooms$")
	public void click_on_rooms(){
		hotelsLanding().clickOnRooms();
	}

	
	@When("^Select \"([^\"]*)\" from Rooms$")
	public void select_from_Rooms(String selectRooms) {
		hotelsLanding().selectRooms(selectRooms);
	}


	@When("^Click on Seach for Hotels$")
	public void click_on_Seach_for_Hotels(){
		hotelsLanding().clickOnSearchHotels();
	   
	}


	

	
}
