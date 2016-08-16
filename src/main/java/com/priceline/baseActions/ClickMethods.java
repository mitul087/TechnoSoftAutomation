package com.priceline.baseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.priceline.utilities.GlobalConfig;

public class ClickMethods extends GlobalConfig{
	
	public FindMethods  fm = null;
	
	
	
	/*
	 * This constructor creates ClickMethods Object 
	 * to get any web element by using getElement method in that object.
	 * Ataul
	 * 8-16-2016 22:14
	 */
	
	public ClickMethods(){
		fm = new FindMethods();
	}	
		
		
	
	
	     
	/*
	 * This method locates elements and click on it.
	 * ataul
	 * 8-11-2016 16:41
	 */
	
	public void clickOnElement(String locator, String attributeOfLocator, String isShowStopper){		
		WebElement element = fm.getElement(locator, attributeOfLocator);
			element.click();	
		
		
	}
	
	public void findByxpathDyanamic(){
		
	}

}
