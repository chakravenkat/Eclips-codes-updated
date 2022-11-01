package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//		
	//	"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	

	}

}
