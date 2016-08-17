package com.priceline.baseActions;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.priceline.utilities.GlobalConfig;

public class InputMethods extends GlobalConfig{
	
	/* Enter Data Into Field
	 * Ataul
	 * 8-11-2016 16:40
	 */
	
	public FindMethods fm = null;
	
	/*
	 * This constructor creates findmethods object to get different find elements using methods in it.
	 * Ataul
	 * 8-16-2016 13:05
	 */
	public InputMethods(){
		
		fm = new FindMethods();		
	}
	
	
	/*
	 * 
	 * This method locate the input elements and send keys to it.
	 * Ataul
	 * 8-16-2016 13:09
	 */
	public void sendInputKeys(String locator, String attributeOfLocator, String message){
		
		try{
			WebElement element = fm.getElement(locator, attributeOfLocator);
			element.sendKeys(message);
		} catch (NoSuchElementException e){
			
			if(e != null){
				
				Assert.fail("*** No Such Element Found ***");
				
				
			}			
		}		
	}
	
	/*
	 * 
	 * This method finds the elements needed extra time to be visible in DOM and then send keys to it
	 * 
	 * Ataul
	 * 8-16-2016 13:11
	 */
	public void sendInputKeys(String elementStatus, String locator, String attributeOfLocator,int waitTime,String message){
		
		try{
			WebElement element = fm.getElement(elementStatus, locator, attributeOfLocator, waitTime);	
			element.sendKeys(message);
			
		} catch(NoSuchElementException e){
			
			System.out.println("***** No Such Element found !!! ");
		}
		
	}
}
