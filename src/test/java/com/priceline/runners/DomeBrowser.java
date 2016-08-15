/**
 * 
 */
package com.priceline.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author arafatmamun
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "src/test/resources/features/browser.feature",
        glue = "com/priceline/testSteps/"
)
public class DomeBrowser {

}
