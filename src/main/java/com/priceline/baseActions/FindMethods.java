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
import com.priceline.utilities.KeyHandler;

/**
 * @author arafatmamun
 *
 */
public class FindMethods extends GlobalConfig{
	
	KeyHandler kh = null;
	/*
	 * Constructor
	 * Arafat Mamun
	 * 8-16-2016 14:34
	 */
	public FindMethods(){
		kh = new KeyHandler();
	}	
	
	/*
	 * Find Specific Element for Web Page
	 * Arafat Mamun
	 * 8--16-2016 9:45
	 * * Parameters:
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
	 */
	public  WebElement getElement(String locator, String attributeOfLocator)throws NoSuchElementException{
		
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
	 * * Parameters:
	 * 		elementStatus: isVisible / is Displayed / isEnable / isDisplayed 
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
	 * 		waitTime : wait time in seconds
	 */
	public WebElement getElement(String elementStatus, String locator, String attributeOfLocator,
										int waitTime )throws NoSuchElementException{
			
		WebElement myElement = null;
		
		if(elementStatus.equalsIgnoreCase( kh.isVisible() ))
			myElement = getElementIfVisible(locator, attributeOfLocator, waitTime);
		/* Work Is Not done yet!
		else if(locator.equalsIgnoreCase( isDisplayed() ))
			myElement = myDriver.findElement(By.className(attributeOfLocator));
		*/
		return myElement;
	}
	
	
	/*
	 * Get an Element when Its Visible By Implementing Conditional Wait
	 * Arafat Mamun
	 * 8-16-2016 11:53
	 */
	
	private WebElement getElementIfVisible(String locator, String attributeOfLocator, int waitTime){
		
		WebElement myElement= null;
		waitTime = kh.waitTime( waitTime);
		
		WebDriverWait expectedWait = new WebDriverWait(myDriver, waitTime);
		expectedWait.pollingEvery(1, TimeUnit.SECONDS);
		
		if(locator.equalsIgnoreCase("id"))
			myElement = expectedWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(attributeOfLocator)));
		else if(locator.equalsIgnoreCase("className"))
			myElement = expectedWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(attributeOfLocator)));
		else if(locator.equalsIgnoreCase("name"))
			myElement = expectedWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(attributeOfLocator)));
		else if(locator.equalsIgnoreCase("xpath"))
			myElement = expectedWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(attributeOfLocator)));
		else if(locator.equalsIgnoreCase("css"))
			myElement = expectedWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(attributeOfLocator)));
		else if(locator.equalsIgnoreCase("linkText"))
			myElement = expectedWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(attributeOfLocator)));
		
		return myElement;
	}
	
}
