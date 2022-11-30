package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addObject(String logicalName, By by) {
		ObjRep.put(logicalName, by);
		
		
	}
	
	public void enterIntoTextBox(String logicalName, String InputData) {
		WebElement element= getWebElement(logicalName);
		enterIntoTextBox(element,InputData);
		
	}
	
	

	public void clickCheckBox(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickCheckBox(element);
		
	}
	
	

	public void clickonButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickonButton(element);
		
	}
	
/*-------------------------------------------------------------*/
	
	private void enterIntoTextBox(WebElement element, String inputData) {
		waitforElement(element);
		element.sendKeys(inputData);
		
	}
	
	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	private void clickonButton(WebElement element) {
		waitforElement(element);
		element.click();
		
	}

	private void clickCheckBox(WebElement element) {
		waitforElement(element);
		element.click();
		
	}
	private WebElement getWebElement(String logicalName) {
		By by = ObjRep.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
	}

	

	

}
