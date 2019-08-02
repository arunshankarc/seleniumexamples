package com.selenium.automation.dropdownsradios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleLinksSelection {
	public static void main(String[] args) {
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// implicit wait -  dynamic wait
		// applicable to all driver.findElement commands
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://cnn.com");
		
		WebElement box=driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println("Total links - "+links.size());
		// From a part of webpage if you want to select all links avoid //a - can cause wrong output
		links =box.findElements(By.xpath("//a"));
		System.out.println("Total links - "+links.size());// wrong output
		
		for(int i=0;i<links.size();i++){
			String text = links.get(i).getText();
			System.out.println(text);
			links.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://cnn.com");
			// Lets say below code of recreating webelement is not written then because the web page changes
			// stalereferenceelement exception is found
			// Change of webpage (refresh) and re-using the element from previous page causes stalereferenceelement exception
			/*
			box=driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]"));
			links = box.findElements(By.tagName("a"));
			System.out.println("-------------------------");
			*/
			
		}
	}
}
