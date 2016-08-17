/**
 * 
 */
package com.priceline.pageObjects;

import java.util.Arrays;
import java.util.List;

import com.priceline.utilities.KeyHandler;
import com.priceline.utilities.MethodHandler;

/**
 * @author arafatmamun
 *
 */
public class HotelsLanding extends MethodHandler{
	
	private String enterCityName = "//*[@id='hotel-dest']";
	private String checkInField = "//*[@id='hotel-checkin']";
	private String checkOutField= "//*[@id='hotel-checkout']";
	private String selectRooms = "//*[@id='hotel-rooms']";
	private String SearchHotels = "//*[@id='hotel-btn-submit-retl']";
	
	
	public  String month = "ui-datepicker-month";	
	public  String date = "ui-datepicker-calendar";
	public  String year = "ui-datepicker-year";
	public  String nextbuttonx = ".//*[@id='ui-datepicker-div']/div[2]/div/a/span";
	public  String previousbuttonx = ".//*[@id='ui-datepicker-div']/div[1]/div/a/span";
	public  String checkIn = ".//*[@id='ui-datepicker-div']/div[1]";
	public  String checkOut = ".//*[@id='ui-datepicker-div']/div[2]";
	
	private String [] calender = null;
	
	/*
	 * Constructor
	 * Arafat Mamun
	 * 8-16-2016 15:31
	 */
	private KeyHandler kh = null;
	public HotelsLanding(){
		kh = new KeyHandler();
		getCalArrayFilled();
	}
	
	/*
	 * Enter a City Name in "Where are you going?" field
	 * Arafat Mamun
	 * 8-16-2016 14:19
	 */
	public void enterCityName( String value ){
		inputMethods().sendInputKeys(kh.xpath(), enterCityName, value);
	}
	
	/*
	 * Click On check In field
	 * Arafat Mamun
	 * 8-16-2016 16:00
	 */
	public void clickOnCheckInField(){
		clickMethods().clickOnElement(kh.xpath(), checkInField, kh.no());
	}
	
	/*
	 * This method allows user to choose date	 
	 * Ataul
	 * 8-17-2016
	 */
	public void selectCheckInDates(String dValue){		
		datePickerMethods().getSelectedDate(kh.isVisible(),calender,dValue,10,kh.no());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*
	 * This method allows user to choose return date.	 
	 * Ataul
	 * 8-17-2016
	 */
	public void selectCheckOutDates(String dValue){		
		datePickerMethods().getSelectedDate(kh.isVisible(),calender,dValue,10,kh.no());
		
	}
	
	/*
	 * Click On check In field
	 * Arafat Mamun
	 * 8-17-2016 10:00
	 */
	public void selectCheckInDate(String checkInDate){
		inputMethods().sendInputKeys(kh.xpath(), checkInField, checkInDate);
	}
	
	/*
	 * Enter check Out Field
	 * Rahath Rahman
	 * 8-16-2016 16:32
	 */
	
	public void  clickOncheckOutField(){
		clickMethods().clickOnElement(kh.xpath(),checkOutField, kh.no());
		
	}
	
	/*
	 * This method fills the calender Array with Xpath Value.
	 * 
	 * Ataul
	 * 8-17-2016 23:40
	 */
	public void getCalArrayFilled(){		
		calender = new String[7];		
		calender[0] = month;
		calender[1] = date;
		calender[2] = year;
		calender[3] = nextbuttonx;
		calender[4] = previousbuttonx;	
		calender[5] = checkIn;
		calender[6] = checkOut;
	}
	
	
	/*
	 * Click On check out field
	 * Arafat Mamun
	 * 8-17-2016 10:00
	 */
	public void selectCheckOutDate(String checkOutDate){
		inputMethods().sendInputKeys(kh.xpath(), checkOutField, checkOutDate);
	}
	
	/*
	 * Click On Rooms
	 * Arafat Mamun
	 * 8-17-2016 9:35
	 */
	public void clickOnRooms(){
		clickMethods().clickOnElement(kh.xpath(), selectRooms, kh.no());
	}
	/*
	 * Select rooms 
	 * Rahath Rahman
	 * 8-16-2016 16:50
	 */
	
	public void selectRooms(String selectRooms){
		dropDownMethods().selectFromDropDownList(kh.xpath(),this.selectRooms, selectRooms, kh.no());
	}
	

	/*
	 * Click On Search Hotels button 
	 * Rahath Rahman
	 * 8-16-2016 16:50
	 */
	
	public void clickOnSearchHotels(){
		clickMethods().clickOnElement(kh.xpath(),SearchHotels, kh.no());
	}
	
	
	
}
