/**
 * 
 */
package com.priceline.runners;



import org.junit.runner.RunWith;

import com.priceline.utilities.GlobalConfig;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author arafatmamun
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "src/test/resources/features/Demo002.feature",
        glue = "com/priceline/testSteps/"
)

public class Demo002Test extends GlobalConfig{
	
	/*@Test
	  public void run_cukes () throws IOException {

	    new TestNGCucumberRunner(getClass()).runCukes();
	  }*/
}
