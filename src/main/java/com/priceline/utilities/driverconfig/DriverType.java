package com.priceline.utilities.driverconfig;

import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.util.HashMap;

import static org.openqa.selenium.remote.CapabilityType.PROXY;

public enum DriverType implements DriverSetup {

	FIREFOX {
		public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {

			/***************************************************************
			 * setup Firefox driver for Mac OS X and Windows
			 ***************************************************************/
			// OPTION # 1: Get Firefox driver form MAC OS X local directory
			// String macOSXPathToFirefox = "/Applications/Firefox.app/Contents/MacOS/firefox";
			// System.setProperty("webdriver.firefox.bin", macOSXPathToFirefox);

			// OPTION # 2: Get Firefox driver (binary) form MAC OS X local
			// directory (use with desired capabilities)
			File macOSXPathToFirefoxBinary = new File("/Applications/Firefox.app/Contents/MacOS/firefox-bin");
			FirefoxBinary macOSXFirefoxBinary = new FirefoxBinary(macOSXPathToFirefoxBinary);

			// OPTION # 1: Get Firefox driver form Windows OS local directory
			// String windowsOSPathToFirefox = "%PROGRAMFILES%\MozillaFirefox\firefox.exe";
			// System.setProperty("webdriver.firefox.bin", windowsOSPathToFirefox);

			// OPTION # 2: Get Firefox driver (binary) form Windows OS local directory (use with desired capabilities)
			// File windowsOSPathToFirefoxBinary = new File("%PROGRAMFILES%\Mozilla Firefox\firefox.exe");
			// FirefoxBinary windowsOSFirefoxBinary = new FirefoxBinary(windowsOSPathToFirefoxBinary);

			/***************************************************************
			 * creating Firefox profile (to use with desired capabilities)
			 ***************************************************************/
			// get FireBug Extension file form project's "macChromeDriver" folder
			String projectLocalDir = System.getProperty("user.dir");
			String fileSeparator = System.getProperty("file.separator");
			String firebugExtensionPath = projectLocalDir + fileSeparator + "browserExtensions";
			File firebugExtensionFile = new File(firebugExtensionPath + "/firebug-2.0.17.xpi");

			// create and setup Firefox profile
			FirefoxProfile firefoxProfile = new FirefoxProfile();
			firefoxProfile.setAcceptUntrustedCertificates(false);
			firefoxProfile.setAssumeUntrustedCertificateIssuer(true);
			firefoxProfile.setPreference("browser.download.folderList", 2);
			firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
			firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
			// firefoxProfile.setPreference("browser.download.dir", "C:\\Downloads");
			// firefoxProfile.setPreference("browser.download.downloadDir","C:\\Downloads");
			// firefoxProfile.setPreference("browser.download.defaultFolder","C:\\Downloads");
			// firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/anytext ,text/plain,text/html,application/plain");
			// firefoxProfile.setPreference("network.proxy.type", 1);
			// firefoxProfile.setPreference("network.proxy.http","207.229.122.162");
			// firefoxProfile.setPreference("network.proxy.http_port", 3128);
			try {
				firefoxProfile.addExtension(firebugExtensionFile);
				firefoxProfile.setPreference(
						"extensions.firebug.currentVersion", "2.0.17");
			} catch (Exception e) {
				e.getMessage();
			}

			/***************************************************************
			 * create and setup Desired Capabilities
			 ***************************************************************/
			DesiredCapabilities firefoxCapabilities = DesiredCapabilities.firefox();
			firefoxCapabilities.setPlatform(Platform.ANY);
			firefoxCapabilities.setBrowserName("firefox");
			firefoxCapabilities.setCapability("firefox_binary", macOSXFirefoxBinary);
			firefoxCapabilities.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
			// firefoxCapabilities.setCapability("marionette", true);
			// firefoxCapabilities.setCapability("applicationCacheEnabled", "false");

			return addProxySettings(firefoxCapabilities, proxySettings);
		}

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			return new FirefoxDriver(capabilities);
		}
	},
	CHROME {
		public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {

			// Get Chrome driver form project's "macChromeDriver" folder
			String projectLocalDir = System.getProperty("user.dir");
			String fileSeparator = System.getProperty("file.separator");
			String chromeDriverPath = projectLocalDir + fileSeparator + "macChromeDriver" + fileSeparator + "chromedriver";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);

			/***************************************************************
			 * creating Chrome browser's options and preferences (to use with desired capabilities)
			 ***************************************************************/
			// Set some Chrome browser options
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");
			// chromeOptions.setBinary(chromeDriverPath);
			// chromeOptions.setBinary(new File("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome"));
			// chromeOptions.addArguments("user-data-dir=/Users/sfr/Library/Application Support/Google/Chrome/Default");

			// Set some Chrome browser preferences
			HashMap<String, Object> chromePreferences = new HashMap<String, Object>();
			chromePreferences.put("profile.default_content_settings.popups", 0);
			chromePreferences.put("profile.password_manager_enabled", "false");
			// chromePreferences.put("binary", chromeDriverPath);

			/***************************************************************
			 * create and setup Desired Capabilities
			 ***************************************************************/
			DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
			chromeCapabilities.setPlatform(Platform.ANY);
			chromeCapabilities.setBrowserName("Chrome");
			chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			chromeCapabilities.setCapability("chrome.prefs", chromePreferences);
			// chromeCapabilities.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));

			return addProxySettings(chromeCapabilities, proxySettings);
		}

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			return new ChromeDriver(capabilities);
		}
	},
	IE {
		public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {

			/***************************************************************
			 * setup Internet Explorer driver for Windows OS and project's folder
			 ***************************************************************/
			// OPTION # 1: Get Internet Explorer driver form project's "macIEDriver" folder (use with desired capabilities)
			String projectLocalDir = System.getProperty("user.dir");
			String fileSeparator = System.getProperty("file.separator");
			String internetExplorerDriverPath = projectLocalDir + fileSeparator + "macIEDriver" + fileSeparator + "IEDriverServer.exe";
			File pathToIEDriver = new File(internetExplorerDriverPath);
			System.setProperty("webdriver.ie.driver", pathToIEDriver.getAbsolutePath());

			// OPTION # 2: Get Internet Explorer driver form Windows OS local directory
			// File pathToWindowsIEDriver = new File("C:\\program files\\Mozilla Firefox\\firefox.exe");
			// System.setProperty("webdriver.ie.driver", pathToWindowsIEDriver.getAbsolutePath());

			/***************************************************************
			 * create and setup Desired Capabilities
			 ***************************************************************/
			DesiredCapabilities internetExplorerCapabilities = DesiredCapabilities.internetExplorer();
			internetExplorerCapabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			internetExplorerCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			internetExplorerCapabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
			internetExplorerCapabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
			internetExplorerCapabilities.setCapability("requireWindowFocus", true);
			internetExplorerCapabilities.setCapability("ignoreZoomSetting", true);
			internetExplorerCapabilities.setCapability("internetExplorerBinary", pathToIEDriver);

			return addProxySettings(internetExplorerCapabilities, proxySettings);
		}

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			return new InternetExplorerDriver(capabilities);
		}
	},
	EDGE {
		public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {

			// setup DesiredCapabilities...
			DesiredCapabilities capabilities = DesiredCapabilities.edge();

			return addProxySettings(capabilities, proxySettings);
		}

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			return new EdgeDriver(capabilities);
		}
	},
	SAFARI {
		public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {

			// setup DesiredCapabilities...
			DesiredCapabilities capabilities = DesiredCapabilities.safari();
			capabilities.setCapability("safari.cleanSession", true);

			return addProxySettings(capabilities, proxySettings);
		}

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			return new SafariDriver(capabilities);
		}
	},
	OPERA {
		public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {

			// setup DesiredCapabilities...
			DesiredCapabilities capabilities = DesiredCapabilities.operaBlink();

			return addProxySettings(capabilities, proxySettings);
		}

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			return new OperaDriver(capabilities);
		}
	};

	protected DesiredCapabilities addProxySettings(
			DesiredCapabilities capabilities, Proxy proxySettings) {
		if (null != proxySettings) {
			capabilities.setCapability(PROXY, proxySettings);
		}

		return capabilities;
	}
}