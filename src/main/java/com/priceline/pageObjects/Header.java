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
public class Header extends MethodHandler{
	
	private String hoteslLink = ".//*[@id='global-header-nav-section']/descendant::a[2]";
	private String carsLink = ".//*[@id='global-header-nav-section']/descendant::a[3]";
	private String flightslLink = ".//*[@id='global-header-nav-section']/descendant::a[4]";
	private String PackageslLink = ".//*[@id='global-header-nav-section']/descendant::a[5]";
	private String crusesLink = ".//*[@id='global-header-nav-section']/descendant::a[6]";
	
	/*
	 * Constructor
	 * Arafat Mamun
	 * 8-16-2016 14:38
	 */
	private KeyHandler kh = null;
	public Header(){
		kh = new KeyHandler();
	}
	
	/*
	 * Click On Hotels Header Link
	 * Arafat Mamun
	 * 8-16-2016 14:19
	 */
	public void clickOnHotelsLink(){
		clickMethods().clickOnElement(kh.xpath(), hoteslLink, kh.no());
	}
	
	
}
