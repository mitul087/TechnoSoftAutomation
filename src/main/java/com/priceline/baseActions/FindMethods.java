/**
 * 
 */
package com.priceline.baseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.priceline.utilities.GlobalConfig;

/**
 * @author arafatmamun
 *
 */
public class FindMethods extends GlobalConfig{
	
	/*
	 * Find Specific Element for Web Page
	 * Arafat Mamun
	 * 8--16-2016 9:45
	 */
	public static WebElement getElement(String locator, String attributeOfLocator)throws NoSuchElementException{
		
		WebElement myElement = null;
		
		if(locator.equalsIgnoreCase("id"))
			myElement = myDriver.findElement(By.id(attributeOfLocator));
		else if(locator.equalsIgnoreCase("className"))
			myElement = myDriver.findElement(By.className(attributeOfLocator));
		else if(locator.equalsIgnoreCase("name"))
			myElement = myDriver.findElement(By.name(attributeOfLocator));
		else if(locator.equalsIgnoreCase("xpath"))
			myElement = myDriver.findElement(By.xpath(attributeOfLocator));
		else if(locator.equalsIgnoreCase("css"))
			myElement = myDriver.findElement(By.cssSelector(attributeOfLocator));
		else if(locator.equalsIgnoreCase("linkText"))
			myElement = myDriver.findElement(By.linkText(attributeOfLocator));
		//else throw new NoSuchElementException(attributeOfLocator);
		

		return myElement;
	}
	
	/*
	 * Find Specific Element for Web Page
	 * Arafat Mamun
	 * 8-16-2016 10:04
	 */
	public static List getElements(String locator, String attributeOfLocator)throws NoSuchElementException{
		
		List< WebElement > myElements;
		
		if(locator.equalsIgnoreCase("id"))
			myElements = myDriver.findElements(By.id(attributeOfLocator));
		else if(locator.equalsIgnoreCase("className"))
			myElements = myDriver.findElements(By.className(attributeOfLocator));
		else if(locator.equalsIgnoreCase("name"))
			myElements = myDriver.findElements(By.name(attributeOfLocator));
		else if(locator.equalsIgnoreCase("xpath"))
			myElements = myDriver.findElements(By.xpath(attributeOfLocator));
		else if(locator.equalsIgnoreCase("css"))
			myElements = myDriver.findElements(By.cssSelector(attributeOfLocator));
		else throw new NoSuchElementException(attributeOfLocator);

		return myElements;
	}
}
