package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAler {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/alert");
		WebElement simple = driver.findElement(By.xpath("//button[@id='accept']"));
		simple.click();
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
	
		WebElement confirmalert = driver.findElement(By.xpath("//button[@id='confirm']"));
		confirmalert.click();
		driver.switchTo().alert().accept();
		
		
		WebElement promptalert = driver.findElement(By.xpath("//button[@id='prompt']"));
		promptalert.click();
		driver.switchTo().alert().sendKeys("jeeva");
		driver.switchTo().alert().accept();
		String text = promptalert.getText();
		System.out.println(text);
		System.out.println("Alert Job Done");
		
		
		
		
		
	}

}
