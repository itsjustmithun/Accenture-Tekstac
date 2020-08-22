package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//To check if you have followed the right naming convention for the methods as mentioned in the case study.

public class UserRegistration{
	private WebDriver driver;

    //Define static variable as per requirement
    public static String genderValue;
    
	//Identify the object as per the requirement

	public UserRegistration(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testElements(){

	//Store the placeholder text as per requirement
        genderValue = driver.findElement(By.xpath("/html/body/form/div[6]/input[3]")).getAttribute("value");
	}
}
