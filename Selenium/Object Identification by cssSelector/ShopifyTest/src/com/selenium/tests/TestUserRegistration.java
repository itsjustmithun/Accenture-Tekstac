package com.selenium.tests;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



import org.testng.annotations.Test;

import com.selenium.pages.UserRegistration;
import com.selenium.setup.DriverSetup;

//To check if the results have been stored in the appropriate static variables as mentioned in the case study.
public class TestUserRegistration extends DriverSetup{
	private static final String priority = null;

	WebDriver driver;
	

	public com.selenium.pages.UserRegistration UserRegistration;
	public DriverSetup driverSetup;
	
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		UserRegistration = new UserRegistration(driver);
		}
	
	@Test
	public void testObjectIdentification(){
		UserRegistration.testElements();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
		

	
}
