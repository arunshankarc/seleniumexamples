package com.selenium.automation.dropdownsradios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeLearning {
	public static void main(String[] args)	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cnn.com");
		// waits dynamically where the element is for max waited for 10 seconds, keeps polling
		// and moves ahead as soon as the object is found
		// applicable to all driver.findelement commands
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("selenium");
		// At times the values in an object cannot be read using getText
		// Use getAttribute which reads attributes from tag
		// For example : value attribute holds the value entered dynamically into a text field during programming 
		// Inspect for element and check if value is seen, use that as the parameter inside getattribute
		String text = driver.findElement(By.id("login1")).getText();
		System.out.println(text);

		text= driver.findElement(By.xpath("//div[@class='login-form']/div[3]/div")).getText();
		System.out.println(text);
		
		text=  driver.findElement(By.id("login1")).getAttribute("maxlength");
		System.out.println(text);
		text=  driver.findElement(By.id("login1")).getAttribute("value");// written in text field
		System.out.println(text);
		
		text=  driver.findElement(By.name("proceed")).getAttribute("value");
		System.out.println(text);
		
		text=  driver.findElement(By.id("remember")).getAttribute("checked");
		System.out.println(text);

	}
}
