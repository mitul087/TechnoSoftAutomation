package com.priceline.testRunners;

import com.priceline.testSteps.DemoSteps;
import com.priceline.utilities.GlobalConfig;

public class DemoTest extends GlobalConfig{
	
	/*
	 * Demo Test To get page title
	 * Arafat Mamun
	 * 8-11-2016 13:44
	 */
	public static void Demo0001Test(){
		DemoSteps dm = new DemoSteps(); // its only for running without Cucumber
		dm.demo001Steps();
	}
}
