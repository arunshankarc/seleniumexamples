package com.selenium.automation.browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IEOptions {
	@Test
	public void ieOptions()	{
		// zoom level
		// protected mode
		// Security - Allow contents
		// 32 bit or 64 bit IE
		
		
		// pre requisites - careful with IE version - 11
		// logs
		// page load strategy - NOT POSSIBLE
		// binary - NOT POSSIBLE
		// PROXY	
		// Profiling - NOT POSSIBLE
		// Notifications - NOT POSSIBLE
		// certificate
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY,"INFO");      
		//System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY,"FATAL");      
		//System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY,"ERROR");      
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGFILE_PROPERTY, "D:\\IE.log");
	   // System.setProperty(InternetExplorerDriverService.IE_DRIVER_SILENT_PROPERTY, "true");
		InternetExplorerOptions options = new InternetExplorerOptions();
		//options.setPageLoadStrategy("");
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "D:\\Selenium Drivers\\IEDriverServer.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		// Enable proxy but will enable in system settings
/*
		String PROXY = "83.209.94.89:44557";
	      Proxy proxy = new Proxy();
	      proxy.setAutodetect(false);
	      proxy.setProxyType(Proxy.ProxyType.MANUAL);
	      proxy.setSocksProxy(PROXY);
	      cap.setCapability(CapabilityType.PROXY, proxy);
		  options.merge(cap);
*/		
		
		WebDriver driver = new InternetExplorerDriver(options);
    	driver.get("https://192.163.254.17/");
    	// Get rid of https allow page - standard code
		driver.get("javascript:document.getElementById('overridelink').click();");
	}

}
