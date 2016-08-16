/**
 * 
 */
package com.priceline.baseActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.priceline.utilities.GlobalConfig;

/**
 * @author arafatmamun
 *
 */
public class FindMethods extends GlobalConfig{
	
	/*
	 * isVisible String
	 * Arafat Mamun
	 * 8-16-2016 10:47
	 */
	public String isVisible(){
		return "isVisible";
	}
	
	/*
	 * isDisplayed String
	 * Arafat Mamun
	 * 8-16-2016 10:48
	 */
	public String isDisplayed(){
		return "isDisplayed";
	}
	
	/*
	 * isEnable String
	 * Arafat Mamun
	 * 8-16-2016 10:49
	 */
	public String isEnable(){
		return "isEnable";
	}
	
	/*
	 * isPresent String
	 * Arafat Mamun
	 * 8-16-2016 10:47
	 */
	public String isPresent(){
		return "isPresent";
	}
	
	/*
	 * Wait Time Converter
	 * Arafat Mamun
	 * 8-16-2016 10:47
	 * parameter:
	 * 	inSeconds: receive wait time in Second
	 * Return: return time in miliseconds;
	 */
	public int waitTime(int inSeconds){
		return inSeconds * 1000;
	}
	
	/*
	 * Find Specific Element for Web Page
	 * Arafat Mamun
	 * 8--16-2016 9:45
	 * * Parameters:
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
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

		return myElement;
	}
	
	/*
	 * Find Specific Element List for Web Page
	 * Arafat Mamun
	 * 8-16-2016 10:04
	 * * Parameters:
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
	 */
	public List getElements(String locator, String attributeOfLocator)throws NoSuchElementException{
		
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
	
	/*
	 * Git Element if Its Visible with Conditional Wait
	 * Arafat Mamun
	 * 8-16-2016 10:39
	 */
	public WebElement getElement(String elementStatus, String locator, String attributeOfLocator,
										int waitTime )throws NoSuchElementException{
			
		WebElement myElement = null;
		
		if(elementStatus.equalsIgnoreCase( isVisible() ))
			myElement = getElementIfVisible(locator, attributeOfLocator, waitTime);
		else if(locator.equalsIgnoreCase( isDisplayed() ))
			myElement = myDriver.findElement(By.className(attributeOfLocator));

		return myElement;
	}
	
	
	/*
	 * Get an Element when Its Visible By Implementing Conditional Wait
	 * Arafat Mamun
	 * 8-16-2016 11:53
	 */
	
	private WebElement getElementIfVisible(String locator, String attributeOfLocator, int waitTime){
		
		WebElement myElement= null;
		waitTime = waitTime( waitTime);
		
		WebDriverWait expectedWait = new WebDriverWait(myDriver, waitTime);
		expectedWait.pollingEvery(1, TimeUnit.SECONDS);
		expectedWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(attributeOfLocator)));
		
		return myElement;
	}
	
}
