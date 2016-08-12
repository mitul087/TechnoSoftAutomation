package com.priceline.baseActions;



import org.testng.Assert;

import com.priceline.utilities.GlobalConfig;

public class DemoMethods extends GlobalConfig{
	
	/*
	 * Demo method to get Title of the page
	 * Arafat Mamun
	 * 8-11-2016 13:40
	 */
	public void getPageTilet(){
		System.out.println( myDriver.getTitle() );
		Assert.assertEquals("true", "true");
		System.out.println("Demo Methods");
	}
	
	public void getPageTiletTwo(){
		System.out.println( myDriver.getTitle() );
		try{
			Assert.assertEquals("true", "true");
		}catch ( Exception excep){
			System.out.println("Assertion Error");
		}
		System.out.println("Demo Methods");
	}
}
