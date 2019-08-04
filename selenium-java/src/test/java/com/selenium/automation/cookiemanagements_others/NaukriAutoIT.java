package com.selenium.automation.cookiemanagements_others;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriAutoIT {
	public static void main(String[] args) throws IOException	{

		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,"D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys("arunshankar.c@gmail.com");
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("Saibaba07!");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'My Naukri')]"))).build().perform();
		WebDriverWait waits = new WebDriverWait(driver, 10);
		waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();
		driver.findElement(By.xpath("//input[@id='attachCV']")).click();
		//new ProcessBuilder("D:\\Personel\\selenium_learning\\selenium-java\\src\\test\\java\\com\\selenium\\automation\\cookiemanagements_others\\run.exe",
		//	                "D:\\Personel\\Arun_Shankar_Resume.docx", "Open").start();
		new ProcessBuilder("D:\\Personel\\selenium_learning\\selenium-java\\src\\test\\java\\com\\selenium\\automation\\cookiemanagements_others\\run.exe").start();
	}

}
