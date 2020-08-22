package com.selenium.setup;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


// Please do not change following code

public class DriverSetup {
	private WebDriver driver;
	public static String baseUrl = "http://webapps.tekstac.com/Shopify/";
	
	public WebDriver getDriver() {
		
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		FirefoxProfile profile=new FirefoxProfile();
        profile.setPreference("marionette.logging", "TRACE");
	    FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		firefoxOptions.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.navigate().to(DriverSetup.baseUrl);
		
		return driver;
	}

	
}
