package com.priceline.utilities;

import com.priceline.baseActions.ClickMethods;
import com.priceline.baseActions.DropDownMethods;
import com.priceline.baseActions.InputMethods;

public abstract class MethodHandler{
	
	/*
	 * Object for Click Methods
	 * Arafat Mamun
	 * 8-16-2016 14:23
	 */
	public ClickMethods clickMethods(){
		ClickMethods clickMethods = new ClickMethods();
		return clickMethods;
	}
	
	/*
	 * Object for Input Methods
	 * Arafat Mamun
	 * 8-16-2016 15:35
	 */
	public InputMethods inputMethods(){
		InputMethods inputMethods = new InputMethods();
		return inputMethods;
	
	}

	/*
	 * Object for Input Methods
	 * Rahath Rahman
	 * 8-16-2016 17:25
	 */
	
	public DropDownMethods dropDownMethods(){
		DropDownMethods	dropDownMethods = new DropDownMethods();
		return dropDownMethods;
	}




}






