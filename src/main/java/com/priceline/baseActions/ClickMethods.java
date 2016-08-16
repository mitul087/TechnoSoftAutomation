package com.priceline.baseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.priceline.utilities.GlobalConfig;

public class ClickMethods extends GlobalConfig{
	
	public FindMethods  fm = null;
	public WebElement element = null;
	
	
	/*
	 * This constructor creates ClickMethods Object
	 * 
	 * 
	 */
	
	public ClickMethods(){
		
		
		
		
	}
	
	     
	/*
	 * This method locates elements
	 * ataul
	 * 8-11-2016 16:41
	 */
	
	public void clickOnElement(String locator, String attributeOfLocator, String isShowStopper){
		
		getElement(locator,attributeOfLocator,isShowStopper);
		
		
		
		
		
		
	}

}
