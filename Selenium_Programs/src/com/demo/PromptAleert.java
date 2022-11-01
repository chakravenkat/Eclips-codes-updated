package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAleert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		WebElement simple = driver.findElement(By.xpath("//input[@type='button']"));
		simple.click();
		driver.switchTo().alert().accept();
		WebElement conform = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		conform.click();
		String text = conform.getText();
		System.out.println(text);
		
         
		driver.switchTo().alert().accept();
		
		
		WebElement prom = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		prom.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Rakki");
		
	
		//System.out.println(text);
	
	
		alert.accept();
	
	
		
		
		
		
	}

}
