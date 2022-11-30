package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	 protected static WebDriver driver;
	 static CommonUtilities common = new CommonUtilities();
	
	public static void launchapplication() throws IOException {
	  String url = common.getproperty("url");
	  driver= getDriver();
	  driver.get(url);
	
	}

	public static WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		 return driver;
	}
	
	public static void close() {
		try {
			driver.close();
			driver = null;
		} catch (UnreachableBrowserException e) {

		}
	}
}
