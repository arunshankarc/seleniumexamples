package com.selenium.automation.waits_alerts_windows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowLearning {

	public static void main(String[] args)	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		driver.navigate().to("http://naukri.com");
		Set<String> windIds = driver.getWindowHandles();
		System.out.println(windIds.size());
		Iterator<String> iterator = windIds.iterator();
		// Always getWindowHandles() will return ordered set, main window, first pop up, second pop up etc 
		String mainWindow = iterator.next();
		driver.switchTo().window(iterator.next());
		driver.close();
		driver.switchTo().window(iterator.next());
		driver.close();
		driver.switchTo().window(mainWindow);
		// In IE coming back to main window does not work in that case use below switch: especially in IE	
		// driver.switchTo().defaultContent()
		driver.close(); // close the main driver and end selenium session
		*/
		driver.get("https://www.jobserve.com/");
		driver.findElement(By.xpath("//a[@id='SPTPosTitleLink']")).click();
		WebDriverWait waits = new WebDriverWait(driver, 10);
		Set<String> windIds = driver.getWindowHandles();
		System.out.println(windIds.size());
		Iterator<String> iterator = windIds.iterator();
		String mainWindow = iterator.next();
		driver.switchTo().window(iterator.next());
		waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='td_applynewwin_btn']"))));
		driver.close();
		driver.switchTo().window(mainWindow);
	}
}
