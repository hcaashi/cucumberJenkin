package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Steps extends BaseTest{
	
	
	PageFactory pageFactory = new PageFactory();
	BasePage page;
	
	@Before
	public void setup() throws IOException {
		launchapplication();
	}
	
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		page=pageFactory.initialize(pageName);
	}
	@When("User enter into text box {string} {string}")
	public void user_enter_into_text_box(String logicalName, String InputData) {
		page.enterIntoTextBox(logicalName,InputData);
	}
	@Then("User Clicks on CheckBox {string}")
	public void user_clicks_on_check_box(String logicalName) {
	   page.clickCheckBox(logicalName);
	}
	@Then("User Clicks on Button {string}")
	public void user_clicks_on_button(String logicalName) {
	   page.clickonButton(logicalName);
	}
	
	@After
	public void teardown(Scenario scenario) {
		 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.attach(screenshot, "image/png",scenario.getName()); 
			driver.close();
		driver = null;
	}
	
}
