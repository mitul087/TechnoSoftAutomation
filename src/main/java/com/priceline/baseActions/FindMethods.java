/**
 * 
 */
package com.priceline.baseActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;
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
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(webdriver)
                .withTimeout(40, TimeUnit.SECONDS)
                .pollingEvery(400, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
		
        myElement = wait.until(new Function<WebDriver, WebElement>() {
        	
            public WebElement apply(WebDriver driver) {
            	
            	WebElement element = null;
            	if(locator.equalsIgnoreCase("id"))
            		element = driver.findElement(By.id(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("className"))
        			element = driver.findElement(By.className(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("name"))
        			element = driver.findElement(By.name(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("xpath"))
        			element = driver.findElement(By.xpath(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("css"))
        			element = driver.findElement(By.cssSelector(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("linkText"))
        			element = driver.findElement(By.linkText(attributeOfLocator));
                return element;
            }
        });
        
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
			myElements = webdriver.findElements(By.id(attributeOfLocator));
		else if(locator.equalsIgnoreCase("className"))
			myElements = webdriver.findElements(By.className(attributeOfLocator));
		else if(locator.equalsIgnoreCase("name"))
			myElements = webdriver.findElements(By.name(attributeOfLocator));
		else if(locator.equalsIgnoreCase("xpath"))
			myElements = webdriver.findElements(By.xpath(attributeOfLocator));
		else if(locator.equalsIgnoreCase("css"))
			myElements = webdriver.findElements(By.cssSelector(attributeOfLocator));
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
		
		WebDriverWait expectedWait = new WebDriverWait(webdriver, waitTime);
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
