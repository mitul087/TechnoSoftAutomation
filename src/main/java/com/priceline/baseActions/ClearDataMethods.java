/**
 * 
 */
package com.priceline.baseActions;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.priceline.utilities.GlobalConfig;


/**
 * @author arafatmamun
 *
 */
public class ClearDataMethods extends GlobalConfig{
	
	FindMethods fm =null;
	/*
	 * Constructor
	 * Creating FindMethods Object
	 */
	public ClearDataMethods(){
		fm = new FindMethods();
	}
	
	/*
	 * Clear Data Field with Locator
	 * Arafat Mamun
	 * 8-16-2016  12:33
	 * * Parameters:
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
	 * 		isShowStopper : yes /  no 
	 */
	public void clearDataField(String locator, String attributeOfLocator, String isShowStopper){
		
		try{
			WebElement myElement = fm.getElement(locator, attributeOfLocator);
			myElement.clear();
			
		} catch(NoSuchElementException exc){
			Assert.fail("No Element 1");
		} catch(NullPointerException exc){
			Assert.fail("No Element 2");
		}
	}
	
	/*
	 * Clear Data Field Of an Element
	 * Arafat Mamun
	 * 8-16-2016  12:33
	 * * Parameters:
	 * 		myElement: Any Web Element
	 * 		isShowStopper : yes /  no 
	 */
	public void clearDataField(WebElement myElement, boolean isShowStopper, String statusMessage){
		
		try{
			myElement.clear();
		} catch(NoSuchElementException exc){
			Assert.fail("No Element 1");
		} catch(NullPointerException exc){
			Assert.fail("No Element 2");
		}
	}
}
