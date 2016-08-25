package com.priceline.utilities;

import com.priceline.pageObjects.Header;
import com.priceline.pageObjects.HotelsLanding;
import com.priceline.pageObjects.MyTripsLink;

public abstract class PageObjectHandler {
	
	/*
	 * Object For Header Page
	 * Arafat Mamun
	 * 08-11-2016 13:31
	 */
	public static Header header(){
		Header header = new Header();
		return header;
	}
	
	/*
	 * Object For Hotel Landing Page
	 * Arafat Mamun
	 * 08-11-2016 13:31
	 */
	public static HotelsLanding hotelsLanding(){
		HotelsLanding hotelsLanding = new HotelsLanding();
		return hotelsLanding;
	}
	
	public static MyTripsLink myTripsLink(){
		MyTripsLink myTripsLink = new MyTripsLink();
		return myTripsLink;
		
		
	}
}
