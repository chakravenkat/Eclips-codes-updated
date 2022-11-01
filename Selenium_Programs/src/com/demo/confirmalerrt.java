package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmalerrt {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Driver\\chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Alert.html");
		WebElement simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simple.click();
		driver.switchTo().alert().accept();
		

		WebElement conform = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		conform.click();
		driver.switchTo().alert().accept();
		
		
		

		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		prompt.click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("greens");
		String text1 = alert.getText();
		System.out.println(text1);
		driver.switchTo().alert().accept();
		
	
//		driver.switchTo().alert().sendKeys("kamal");
//		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
