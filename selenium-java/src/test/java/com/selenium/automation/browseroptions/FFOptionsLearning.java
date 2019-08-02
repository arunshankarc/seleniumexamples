package com.selenium.automation.browseroptions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class FFOptionsLearning {

	@Test
	public void runOptions()	{
		// Marionette logs
		// Below line of code does not print any marionette logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		// Below line of code marionette logs to a location
		//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "D:\\driver.logs");
		
		//point to firefox binary
		FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("Path to firefox");
		// Wait for send keys to field strategies:
		// EAGER - sends keys immediately - very fast
		// NONE - A bit slow compared to EAGER
		// NORMAL - normal send keys time similar to normal page load
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		// Create a new profile of firefox - firefox.exe -p profilemanager
		// Open with my own firefox profiles
		ProfilesIni profiles = new ProfilesIni(); // all profiles on pc
		FirefoxProfile prof = profiles.getProfile("arun");
		
		// disable notifications - for example the ones we see allow notifications for this website
		// The ones which says allow notifications on  this page --> Allow or Block
		prof.setPreference("dom.webnotifications.enabled", false);
		
		// handle https :
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);
		/*
		// enable vpn
		prof.setPreference("network.proxy.type", 1);
		prof.setPreference("network.proxy.socks", "<IP address>");
		prof.setPreference("network.proxy.socks_port", "<port number>");
		*/
		options.setProfile(prof);
		
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://google.com");
	}
}
