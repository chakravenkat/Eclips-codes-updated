package com.selenium;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	browser.get("https://www.facebook.com");
	}

}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	