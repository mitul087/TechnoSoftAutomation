import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.priceline.baseActions.FindMethods;
import com.priceline.utilities.GlobalConfig;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 */

/**
 * @author arafatmamun
 *
 */
public class MouseHoverMethods extends GlobalConfig{
	
	FindMethods fm =null;
	/*
	 * Constructor
	 * Creating FindMethods Object
	 */
	public MouseHoverMethods(){
		fm = new FindMethods();
	}
	
	/*
	 * Method for Mouse Hover on an Element
	 * Arafat Mamun
	 * 8-16-2016 13:25
	 * * Parameters:
	 * 		elementStatus: isVisible / is Displayed / isEnable / isDisplayed 
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
	 * 		waitTime : wait time in seconds
	 */
	
	public void mouseHover(String locator, String attributeOfLocator, String isShowStopper){
		
		try{
			WebElement myElement = fm.getElement(locator, attributeOfLocator);
			Actions myAction = new Actions(myDriver);
			myAction.moveToElement(myElement).build().perform();
		} catch(NoSuchElementException exc){
			Assert.fail("No Element 1");
		} catch(NullPointerException exc){
			Assert.fail("No Element 2");
		}
		
	}
}
