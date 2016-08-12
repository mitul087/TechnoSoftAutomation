/**
 * 
 */
package com.priceline.runners;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import com.priceline.utilities.GlobalConfig;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * @author arafatmamun
 *
 */
@Test
//@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "src/test/resources/features/",
        glue = "com/priceline/testSteps/"
)

public class Demo002Test extends GlobalConfig{
	
	/*@Test
	  public void run_cukes () throws IOException {

	    new TestNGCucumberRunner(getClass()).runCukes();
	  }*/
}
