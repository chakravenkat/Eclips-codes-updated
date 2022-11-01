package com.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDrop{
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement creatac = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatac.click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstName.sendKeys("vijay");
		WebElement surename = driver.findElement(By.name("lastname"));
		surename.sendKeys("prakash");
		WebElement mob = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mob.sendKeys("9042919143");
		WebElement psswrd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		psswrd.sendKeys("9786262326");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		day.click();
		Select ref = new Select(day);
		ref.selectByValue("30");

		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select sl = new Select(month);
		sl.selectByVisibleText("Apr");

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yr = new Select(year);
		yr.selectByValue("2014");
		

		WebElement gender = driver.findElement(By.xpath("//*[text()='Male']"));
		gender.click();
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\screen3.png");
//		FileUtils.copyFile(source, des);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
//		
//		TakesScreenshot sc =(TakesScreenshot)driver;
//		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
//		File des2=new File("C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\screen4.png");
//		FileUtils.copyFile(screenshotAs, des2);

	}
	}

