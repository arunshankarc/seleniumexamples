package com.selenium.automation.browseroptions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.testng.annotations.Test;

public class DifferentBrowsers 
{
	@Test
	public  void launchSite()	{
		/* Firefox 
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		*/
		/*
		 * Chrome
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,"D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		 */
		
		/*IE
		 *Allow zoom level as 100%
		 *tools -> internet options -> security - protected mode turned off in internet options for all variety of security
		 *tools -> internet options -> advanced - Allow active content to run in files on my computer enabled 
		 * version of IE - 32 bit or 64 bit
		 */
		/*
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "D:\\Selenium Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		*/
		// Edge
		
		/*
		 * Get version of Edge and download from https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
		 */
		
		System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, "D:\\Selenium Drivers\\MicrosoftWebDriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		
	}
	
 
}
