package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends BasePage{
	
	static WebDriver driver;
	
	public HomePage() {
		super(driver=BaseTest.getDriver());
	//Method which accepts String , By byobj 
	addObject("UserMenuDropDown", By.id("username"));
	addObject("AccountTab", By.id("password"));
	
}
}
