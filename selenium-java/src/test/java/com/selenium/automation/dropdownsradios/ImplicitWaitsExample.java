package com.selenium.automation.dropdownsradios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitsExample {
	public static void main(String[] args)	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cnn.com");
		// waits dynamically where the element is for max waited for 10 seconds, keeps polling
		// and moves ahead as soon as the object is found
		// applicable to all driver.findelement commands
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
