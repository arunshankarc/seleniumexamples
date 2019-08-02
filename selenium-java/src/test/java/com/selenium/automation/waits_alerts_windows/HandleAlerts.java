package com.selenium.automation.waits_alerts_windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {
	public static void main(String[] args) throws InterruptedException	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,"D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		// If alert takes some time to load use waits
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		//command to switch to alert pop up
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// to cancel alert - alert.dismiss();
		// Give below command always to switch to main content
		driver.switchTo().defaultContent();
	}
}
