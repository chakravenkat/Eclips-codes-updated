package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project2 {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String url = "http://adactinhotelapp.com/";
		driver.get(url);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chakravarthivenkat");
		driver.findElement(By.name("password")).sendKeys("9966352061");
		driver.findElement(By.id("login")).click();

		WebElement drop = driver.findElement(By.xpath("//select[@name='location']"));
		drop.click();
		Select sc = new Select(drop);
		sc.selectByValue("London");

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select dr = new Select(hotel);
		dr.selectByVisibleText("Hotel Sunshine");

		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select se = new Select(room);
		se.selectByIndex(3);

		WebElement nofrooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select sel = new Select(nofrooms);
		sel.selectByValue("5");

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("30/07/2022");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("02/08/2022");

		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select sele = new Select(adult);
		sele.selectByIndex(2);

		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select selec = new Select(child);
		selec.selectByValue("3");

		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("Vikram");
		driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("Kamal");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("34/36,karnan street,mugappair west,chennai-37.");

		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("9874561478956456");
		WebElement card = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select sc1 = new Select(card);
		sc1.selectByValue("VISA");

		WebElement expdate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select sc2 = new Select(expdate);
		sc2.selectByIndex(4);

		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select sc3 = new Select(expyear);
		sc3.selectByValue("2022");

		driver.findElement(By.xpath("(//input[@type='text'])[14] ")).sendKeys("321");

		driver.findElement(By.xpath("//input[@type='button']")).click();

		driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File as1 = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\scren10.png");
		FileUtils.copyFile((File) as1, des);

		driver.findElement(By.xpath("//input[@name='logout']")).click();
//driver.findElement(By.xpath("//*[contains(text(),'Click here ')]")).click();
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File As = ts1.getScreenshotAs(OutputType.FILE);
		File des1 = new File(
				"C:\\\\Users\\\\Admin\\\\eclipse-workspace-greens\\\\Selenium_Programs\\\\Screenshots\\\\scren11.png");
		FileUtils.copyFile((File) As, des1);

		System.out.println("project Done");

		// http://www.greenstechnologys.com/selenium-training-in-chennai.html

	}

}
