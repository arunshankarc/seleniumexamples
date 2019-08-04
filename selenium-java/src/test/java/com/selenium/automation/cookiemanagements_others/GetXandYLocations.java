package com.selenium.automation.cookiemanagements_others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetXandYLocations {
	public static void main(String[] args)	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://google.com/");
		System.out.println(driver.findElement(By.name("q")).getLocation().x);
		System.out.println(driver.findElement(By.name("q")).getLocation().y);
	}
}
