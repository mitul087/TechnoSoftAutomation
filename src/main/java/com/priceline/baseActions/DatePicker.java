package com.priceline.baseActions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.priceline.utilities.GlobalConfig;

public class DatePicker extends GlobalConfig{
	
	/* 
	 * Ataul
	 * 8-17-2016 23:37
	 */
	public boolean dateNotFound = true;
	private FindMethods fm = null;
	public static List<String> list = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December");
	private String [] calender = null;
	
	
	/*
	 * This constructor creates FindMethods object and return the webelement for interaction.
	 * Ataul
	 * 8-17-2016 23:37
	 */
	
	public DatePicker(){
		
		fm = new FindMethods();		
	}
	
	/*
	 * 
	 * This method selected the requested date for a user.
	 * Ataul
	 * 8-17-2016 23:40
	 */
	
	public void  getSelectedDate(String elementStatus,String [] cal,String da,int waitTime,String isShowStopper){
		this.calender = cal;
		int expMonth = Integer.parseInt((da.split("/")[0]));
		String expDate = da.split("/")[1];
		int expYear = Integer.parseInt(da.split("/")[2]);
		//myDriver.findElement(By.id(cal[1])).click();
		while (dateNotFound) {
			String calMonth = fm.getElement("className", calender[0]).getText();
			String calYear = fm.getElement("className", calender[2]).getText();
			if (list.indexOf(calMonth) + 1 == expMonth && (expYear == Integer.parseInt(calYear))) {
				try {
					chooseDate(expDate);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dateNotFound = false;
			} else if (list.indexOf(calMonth) + 1 < expMonth && (expYear == Integer.parseInt(calYear))
					|| expYear > Integer.parseInt(calYear)) {
				fm.getElement("xpath", calender[3]).click();
			} else if (list.indexOf(calMonth) + 1 > expMonth && (expYear == Integer.parseInt(calYear))
					|| expYear < Integer.parseInt(calYear)) {
				fm.getElement("xpath", calender[4]).click();
			}
		}

		dateNotFound = true;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public  void chooseDate(String date) throws InterruptedException {
		WebElement dateWidget = webdriver.findElement(By.className(calender[1]));
		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		for (WebElement cell : columns) {
			// Selects Date
			if (cell.getText().equals(date)) {
				cell.findElement(By.linkText(date)).click();
				break;
			}
		}

	}
}
