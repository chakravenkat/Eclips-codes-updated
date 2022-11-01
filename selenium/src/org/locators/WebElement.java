package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class WebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		org.openqa.selenium.WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("9786262326");
		org.openqa.selenium.WebElement element = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		element.sendKeys("9966352061");
		org.openqa.selenium.WebElement findElement2 = driver.findElement(By.name("login"));
		
		findElement2.click();
		
		
		
		
	
		
		
		
	}
	

}
