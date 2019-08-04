package com.selenium.automation.cookiemanagements_others;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class Downloading_File {
	public static void main(String[] args) throws Exception {
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "D:\\Selenium Drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://qtpselenium.com/test/testdownload.php");
		FileDownloader file = new FileDownloader(driver,"D:\\Common\\Temp\\test\\");
		WebElement downloadLink =  driver.findElement(By.xpath("html/body/a[1]"));

		String downloadedFileAbsoluteLocation = file.downloader(downloadLink.getAttribute("href"));
		System.out.println(downloadedFileAbsoluteLocation);
	}
	


}
