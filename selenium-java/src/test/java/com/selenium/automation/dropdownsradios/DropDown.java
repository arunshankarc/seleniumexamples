package com.selenium.automation.dropdownsradios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		// select
		// count total
		// print all
		// find which is selected
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.regelleistung.net/ext/data/?lang=en");
		
		WebElement dropDown = driver.findElement(By.id("form-tso"));
		Select s = new Select(dropDown);
		
		// select
		s.selectByIndex(3);
		s.selectByVisibleText("TenneT");
		s.selectByValue("4"); // --> This is by value <option value="4">50Hertz</option> 
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("Total elements "+options.size());
		for(WebElement e:options){
			System.out.println(e.getText());
		}
		
		System.out.println("Currently selected option -" +s.getFirstSelectedOption().getText());
		

	}

}
