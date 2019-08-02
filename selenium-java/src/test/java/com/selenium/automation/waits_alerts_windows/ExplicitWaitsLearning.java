package com.selenium.automation.waits_alerts_windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsLearning {
	public static void main(String[] args) throws InterruptedException	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		// Wait for 20 seconds max for a given page to load
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://portfolio.rediff.com/portfolio-login");
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys("ashishthakur1983@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='emailsubmit']")).click();
		WebDriverWait waits = new WebDriverWait(driver, 10);
		waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='userpass']"))));
		driver.findElement(By.xpath("//input[@id='userpass']")).sendKeys("test");
	}
}
