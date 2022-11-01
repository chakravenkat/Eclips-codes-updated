package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/");
		
		WebElement search = driver.findElement(By.id("yschsp"));
		search.sendKeys("chrome");
		WebElement sub = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		sub.click();
//		WebElement chrome = driver.findElement(By.xpath("//li[@pos='0']"));
//		chrome.click();
		
	}

}
