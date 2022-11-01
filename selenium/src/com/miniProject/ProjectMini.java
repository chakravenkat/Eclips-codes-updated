package com.miniProject;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectMini {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[text()='Dresses'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Evening Dresses")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("//img[@title='Printed Dress']")).click();
	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		}
		driver.findElement(By.xpath("(//span[text()='Add to cart'])")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("chakravarthi382@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9966352061");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		driver.findElement(By.xpath("//span[text()=' Address']")).click();
				
//		driver.findElement(By.xpath("//img[@id='thumb_11']")).click();

//		driver.findElement(By.xpath("//input[@name='qty']")).sendKeys("5");
//		driver.findElement(By.xpath("//a[@name='Pink']")).click();
//		Robot r = new Robot();
//		driver.findElement(By.xpath("//select[@name='group_1']")).click();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);

//		driver.switchTo().defaultContent();

	}

}
