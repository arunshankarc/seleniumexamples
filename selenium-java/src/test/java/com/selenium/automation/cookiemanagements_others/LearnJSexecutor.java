package com.selenium.automation.cookiemanagements_others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnJSexecutor {
	public static void main() throws InterruptedException	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://mail.rediff.com/cgi-bin/login.cgi'");
		String state = (String)js.executeScript("return document.readyState");
		System.out.println(state);
		Thread.sleep(5000);
		js.executeScript("document.getElementById('login1').value='hello';");
		js.executeScript("window.scrollTo(0,200)");
		//https://www.w3schools.com/jsref/met_document_getelementbyid.asp
	}
}
