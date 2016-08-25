package com.priceline.utilities;

import com.priceline.utilities.driverconfig.DriverFactory;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class GlobalConfig {
 
	public static WebDriver webdriver = null;
	private static ThreadLocal<DriverFactory> driverFactory;
	private static List<DriverFactory> webDriverThreadPool = Collections.synchronizedList(new ArrayList<DriverFactory>());

	public static void instantiateDriverObject() {
		driverFactory = new ThreadLocal<DriverFactory>() {
			@Override
			protected DriverFactory initialValue() {
				DriverFactory driverFactory = new DriverFactory();
				webDriverThreadPool.add(driverFactory);
				return driverFactory;
			}
		};
	}

	public WebDriver getDriver() throws Exception {
		webdriver = driverFactory.get().getDriver();
		return webdriver;
	}

	public void clearCookies() throws Exception {
		getDriver().manage().deleteAllCookies();
	}

	public static void closeDriverObjects() {
		for (DriverFactory driverFactory : webDriverThreadPool) {
			driverFactory.quitDriver();
		}
	}
}