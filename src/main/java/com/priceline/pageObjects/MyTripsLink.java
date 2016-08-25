package com.priceline.pageObjects;

import com.priceline.utilities.KeyHandler;
import com.priceline.utilities.MethodHandler;

public class MyTripsLink extends MethodHandler{
	
	private String myTripsLink = ".//*[@id='in-path-my-trips-click']";
	private String trackMyFlight = ".//*[@id='global-components-track-flights']";
	
	/*
	 * Constructor
	 * Tanvir Ahmed
	 * 8-24-2016
	 */
	private KeyHandler kh = null;
	public MyTripsLink(){
		kh = new KeyHandler();
	}
	
	public void hoverOnMyTrips(){
		System.out.println("hoverOnMyTrips");
		mouseHoverMethods().mouseHover(kh.xpath(), myTripsLink, kh.no());
	}
	
	public void clickOnTrackMyFlight(){
		clickMethods().clickOnElement(kh.xpath(), trackMyFlight, kh.no());
	}
	
	
	

}
