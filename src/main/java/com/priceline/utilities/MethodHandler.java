package com.priceline.utilities;

import com.priceline.baseActions.ClickMethods;
import com.priceline.baseActions.DemoMethods;

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
	
	/*
	 * Object for Click Methods
	 * Arafat Mamun
	 * 8-16-2016 14:23
	 */
	public ClickMethods clickMethods(){
		ClickMethods clickMethods = new ClickMethods();
		return clickMethods;
	}
}
