package com.priceline.testRunners;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import com.priceline.utilities.GlobalConfig;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "src/test/resources/features/Demo001.feature",
        glue = "com/priceline/testSteps/"
)

public class Demo001Test extends GlobalConfig{
	
	/*
	 * Demo Test To get page title
	 * Arafat Mamun
	 * 8-11-2016 13:44
	 */
	
	@Test
	public static void Demo0001Test(){
		System.out.println("Running @TEST Annotation");
		//DemoSteps dm = new DemoSteps(); // its only for running without Cucumber
		//dm.demo001Steps();
		
	}
	
}
