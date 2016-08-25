package com.priceline.utilities;

import org.apache.tika.sax.CleanPhoneText;

import com.priceline.baseActions.Assertion;
import com.priceline.baseActions.ClearDataMethods;
import com.priceline.baseActions.ClickMethods;
import com.priceline.baseActions.DatePicker;
import com.priceline.baseActions.DropDownMethods;
import com.priceline.baseActions.FindMethods;
import com.priceline.baseActions.InputMethods;
import com.priceline.baseActions.MouseHoverMethods;

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
	
	/*
	 * 
	 * This method return Date Picker Object.
	 * Ataul
	 * 8-17-2016 24:26
	 */
	
	public DatePicker datePickerMethods(){		
		DatePicker picker = new DatePicker();
		return picker;		
	}
	
	/*
	 * 
	 * This method return Mouse hover Object.
	 * Tanvir Ahmed
	 * 8-25-2016 24:26
	 */
	
	public MouseHoverMethods mouseHoverMethods(){
		MouseHoverMethods hover = new MouseHoverMethods();
		return hover;
		
	}
	
	/*
	 * 
	 * This method return Assertion Object.
	 * Tanvir Ahmed
	 * 8-25-2016 24:26
	 */
	
	public Assertion assertion(){
		Assertion assertion = new Assertion();
		return assertion;
	}
	
	/*
	 * 
	 * This method return clear Data Object.
	 * Tanvir Ahmed
	 * 8-25-2016 24:26
	 */
	
	public ClearDataMethods clearData(){
		ClearDataMethods clearData = new ClearDataMethods();
		return clearData;
	}
	
	/*
	 * 
	 * This method return Find Methods Object.
	 * Tanvir Ahmed
	 * 8-25-2016 24:26
	 */
	
	public FindMethods findMethods(){
		FindMethods findMethods = new FindMethods();
		return findMethods;
	}




}






