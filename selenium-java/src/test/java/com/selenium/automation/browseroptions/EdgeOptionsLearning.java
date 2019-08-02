package com.selenium.automation.browseroptions;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class EdgeOptionsLearning {

	@Test
	public void edgeOptions()	{
		// Edge - only one browser session can be opened at any point in time, 
		// - if you try to open another one an error is thrown
		
		// pre requisites - careful with edge version
		// logs
		// page load strategy
		// binary - NOT POSSIBLE
		// PROXY- Enable proxy from browser, not possible via code
		// Profiling - NOT POSSIBLE
		// Notifications - Enable/disable notifications from browser, not possible via code
		// certificate
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY,"null");
		EdgeOptions options = new EdgeOptions();
		options.setPageLoadStrategy("eager");
		
		
		EdgeDriver driver = new EdgeDriver(options);// make sure previous session is always closed
		
		// cert
		driver.get("https://192.163.254.17:2083/");
		//2 line code
		driver.findElement(By.id("moreInformationDropdownSpan")).click();
		driver.findElement(By.id("invalidcert_continue")).click();
	}
}
