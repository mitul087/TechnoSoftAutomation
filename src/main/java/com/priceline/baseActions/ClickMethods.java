package com.priceline.baseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
		
		try{
		    WebElement element = fm.getElement(locator, attributeOfLocator);
			element.click();	
			
		} catch(NoSuchElementException e){
			
			System.out.println("********  Element coud not be found   **********");
		}		
	}
	
	
	/*
	 * This method wait for element to be visible then 
	 * try to locate and then return to the appropriate caller.	
	 * Ataul
	 * 8-16-2016
	 */
	
	public void  clickOnElement(String elementStatus,String locator, String attributeOfLocator, int waitTime){
		
		try{
			fm.getElement(elementStatus, locator, attributeOfLocator, waitTime);
			
		} catch(NoSuchElementException e){	
			
			System.out.println("********  Element coud not be found   **********");
			
		}		
	}

}
