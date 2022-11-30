package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriver());
	//Method which accepts String , By byobj 
	addObject("Username", By.id("username"));
	addObject("Password", By.id("password"));
	addObject("RememberMe", By.id("rememberUn"));
	addObject("Login", By.name("Login"));
	
}
}
