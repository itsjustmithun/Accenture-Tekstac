package com.selenium.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//To check if you have followed the right naming convention for the methods as mentioned in the case study.

public class UserRegistration{
	private WebDriver driver;

	//Define static variable as per requirement
    public static String tuName;
    
	//Identify the object as per the requirement

	
	public UserRegistration(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testElements(){

        
	//Store the placeholder text as per requirement
        tuName  = driver.findElement(By.xpath("//*[@id='ttab']/tbody/tr[2]/td[3]")).getText();
	}
}
