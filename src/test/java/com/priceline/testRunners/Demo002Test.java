/**
 * 
 */
package com.priceline.testRunners;

import org.junit.runner.RunWith;

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

public class Demo002Test {

}
