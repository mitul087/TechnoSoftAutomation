/**
 * 
 */
package com.priceline.pageObjects;

import com.priceline.utilities.KeyHandler;
import com.priceline.utilities.MethodHandler;

/**
 * @author arafatmamun
 *
 */
public class HotelsLanding extends MethodHandler{
	
	private String enterCityName = "//*[@id='hotel-dest']";
	private String checkInField = "//*[@id='hotel-checkin']";
	private String checkOutField= "//*[@id='hotel-checkout']";
	private String selectRooms = "//*[@id='hotel-rooms']";
	private String SearchHotels = "//*[@id='hotel-btn-submit-retl']";
	
	/*
	 * Constructor
	 * Arafat Mamun
	 * 8-16-2016 15:31
	 */
	private KeyHandler kh = null;
	public HotelsLanding(){
		kh = new KeyHandler();
	}
	
	/*
	 * Enter a City Name in "Where are you going?" field
	 * Arafat Mamun
	 * 8-16-2016 14:19
	 */
	public void enterCityName( String value ){
		inputMethods().sendInputKeys(kh.xpath(), enterCityName, value);
	}
	
	/*
	 * Click On check In field
	 * Arafat Mamun
	 * 8-16-2016 16:00
	 */
	public void clickOnCheckInField(){
		clickMethods().clickOnElement(kh.xpath(), checkInField, kh.no());
	}
	
	/*
	 * Enter check Out Field
	 * Rahath Rahman
	 * 8-16-2016 16:32
	 */
	
	public void  clickOncheckOutField(){
		clickMethods().clickOnElement(kh.xpath(),checkOutField, kh.no());
		
	}
	
	/*
	 * Click On Rooms
	 * Arafat Mamun
	 * 8-17-2016 9:35
	 */
	public void clickOnRooms(){
		clickMethods().clickOnElement(kh.xpath(), selectRooms, kh.no());
	}
	/*
	 * Select rooms 
	 * Rahath Rahman
	 * 8-16-2016 16:50
	 */
	
	public void selectRooms(String selectRooms){
		dropDownMethods().selectFromDropDownList(kh.xpath(),this.selectRooms, selectRooms);
	}
	

	/*
	 * Click On Search Hotels button 
	 * Rahath Rahman
	 * 8-16-2016 16:50
	 */
	
	public void clickOnSearchHotels(){
		clickMethods().clickOnElement(kh.xpath(),SearchHotels, kh.no());
	}
	
	
	
}
