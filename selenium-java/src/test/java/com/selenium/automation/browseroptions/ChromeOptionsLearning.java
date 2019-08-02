package com.selenium.automation.browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsLearning {

	@Test
	public void runChromeOptions()	{
		ChromeOptions ops = new ChromeOptions();	
		// Disable allow or block options displayed on some websites
		 ops.addArguments("--disable-notifications");
		 
		 // Disables chrome is being controlled by automated software notification
         ops.addArguments("disable-infobars");
         
         ops.addArguments("--start-maximized");
         //ops.addArguments("--proxy-server=http://83.209.94.87:8123");
		 
         
         // 1) Dont give default folder from chrome://version with profile path location
         // 2) When a new profile (with new email address) for example - wildlife.blr@gmail.com is to be opened.
         // 3) create and login as wildlife.blr@gmail.com in chrome.
         // 4) hit chrome://version
         // 5) Get profile path location, excluding the Default location
         // 6) Create a new Default directory inside the profile path, copy all contents inside Default directory
         // 7) Below commands clearly opens the profile with wildlife.blr@gmail.com
         
         ops.addArguments("user-data-dir=C:\\Users\\a.chayapathy\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1\\");
         ops.addArguments("");
         
        // ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
        // ops.setBinary("PATH TO EXE");

        // push all logs to chrome.log
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://chrome.log");
		// Does not show any logs in the stdout
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://google.com");
	}
}
