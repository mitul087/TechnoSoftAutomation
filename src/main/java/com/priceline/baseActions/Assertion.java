package com.priceline.baseActions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.priceline.utilities.GlobalConfig;



public class Assertion extends GlobalConfig{
	
	/*
	 * Ataul
	 * 8-16-2016 14:10
	 */
	public FindMethods fm = null;
	
	/*
	 * This constructor creates findmethods object to get various web elements from it for interaction.
	 * Ataul
	 * 8-16-2016 14:10
	 */
	public Assertion(){
		fm = new FindMethods();
	}
	
	/*
	 * This methods does hard Assert  between actual and expected result
	 * Ataul
	 * 8-16-2016 14:20
	 */
	public void getHardAssert(String locator,String attributeOfLocator,String expectedMessage){
		
		try{
			WebElement element = fm.getElement(locator, attributeOfLocator);
			String actualMessage = element.getText();
			Assert.assertEquals(expectedMessage, actualMessage);
		}catch(NoSuchElementException e){
			
			System.out.println("**** No Such Element found ***** ");
		}		
	}
	
	/*
	 * This method does soft assert between actural and expected messages.
	 * Ataul
	 * 8-16-2016 14:30
	 */
	
	public void getSoftAssert(String locator, String attributeOfLocator, String expectedMessage){
		
		 try{
			 
			 WebElement element = fm.getElement(locator, attributeOfLocator);
			 String actualMessage = element.getText();
			 SoftAssert  sassert = new SoftAssert();
			 sassert.assertEquals(actualMessage, expectedMessage);
		 }catch(NoSuchElementException e){
			 
			 System.out.println("**** No Such Element found *****");
		 }
	}

}
