package com.priceline.utilities;

import com.priceline.pageObjects.Demo;
import com.priceline.testSteps.BrowserConfig;

public abstract class PageObjectHandler extends BrowserConfig{
	
	/*
	 * Object For Demo Page
	 * Arafat Mamun
	 * 08-11-2016 13:31
	 */
	public static Demo demo(){
		Demo demo = new Demo();
		return demo;
	}
}
