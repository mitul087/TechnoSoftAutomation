package com.priceline.utilities;

import com.priceline.baseActions.DemoMethods;
import com.priceline.pageObjects.Demo;

public abstract class MethodHandler{
	
	/*
	 * Object For Demo Methods
	 * Arafat Mamun
	 * 08-11-2016 13:33
	 */
	public static DemoMethods demoMethods(){
		DemoMethods demoMethods = new DemoMethods();
		return demoMethods;
	}
}
