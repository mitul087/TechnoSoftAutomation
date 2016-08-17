package com.priceline.baseActions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.priceline.utilities.GlobalConfig;

public class DropDownMethods extends GlobalConfig{
	
	/*
	 * 
	 * ataul
	 * 8-16-2016 13:17
	 */
	
	public FindMethods fm = null;
	
	/*
	 * This constructor creates FindMethods object to get various methods for returning elements.
	 * Ataul
	 * 8-16-2016 13:50
	 */
	public DropDownMethods(){
		
		fm = new FindMethods();		
	}
	
	/*
	 * This method locate Select drop down elements and then select user input from paramaeter list.
	 * Ataul
	 * 8-16-2016 13:55
	 */		
			
	public void selectFromDropDownList(String locator,String attributeOfLocator,String value, String isShowStopper){
		
		try{			
			WebElement element = fm.getElement(locator, attributeOfLocator);
			Select  dvalue = new Select(element);
			dvalue.selectByVisibleText(value);
		} catch(NoSuchElementException e){
			
			System.out.println("***** No Such Element Found ***** ");
		}			
	}
	
	/*
	 * This methods finds the selectdropdown element needed longer time to be visible and then select value from within drop down list.
	 * Ataul
	 * 8-16-2016 14:00
	 */
	public void selectFromDropDown(String elementStatus, String locator, String attributeOfLocator,int waitTime, String value, String isShowStopper){
		
		try{
			
			WebElement element = fm.getElement(elementStatus, locator, attributeOfLocator, waitTime);
			Select  dvalue = new Select(element);
			dvalue.deselectByVisibleText(value);
		} catch(NoSuchElementException e){
			
			System.out.println("***** No such Element Found **** ");
		}
	}
	
}