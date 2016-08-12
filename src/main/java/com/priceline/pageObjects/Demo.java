package com.priceline.pageObjects;

import com.priceline.utilities.MethodHandler;

public class Demo extends MethodHandler{
	
	/*
	 * Get Demo Page Title
	 * Arafat Mamun
	 * 8-11-2016
	 */
	public void getDemoPageTitle(){
		demoMethods().getPageTilet();
	}
	
	public void getDemoPageTitleTwo() throws Exception{

				demoMethods().getPageTiletTwo();
	}
}
