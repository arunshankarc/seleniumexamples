package com.selenium.automation.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaytmFrames {
	public static void main(String[] args)	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://paytm.com/");
		int total= driver.findElements(By.tagName("iframe")).size();
		//driver.findElement(By.xpath("//div[@class='_3ac-']")).click();
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//qr-code-login/div[2]/div[2]/div[3]/span")).click();
		//driver.switchTo().defaultContent();
		for(int i=0;i<total;i++){
			driver.switchTo().frame(i);
			int s = driver.findElements(By.id("input_0")).size();
			System.out.println("Size - "+s);
			
			if(s==0)
				driver.switchTo().defaultContent();
			else // found the frame
				break;
				
		}
		// interact
		driver.findElement(By.id("input_0")).sendKeys("918982");
		driver.switchTo().defaultContent();
	}
}
