package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		WebElement dropbutton = driver.findElement(By.xpath("(//a[contains(@class,'wp')])[5]"));
		dropbutton.click();

		WebElement single = driver.findElement(By.id("dropdown1"));
		Select sc = new Select(single);
		sc.selectByValue("2");

		WebElement single2 = driver.findElement(By.xpath("//*[@name='dropdown2']"));
		Select sc1 = new Select(single2);
		sc1.selectByIndex(1);
		List<WebElement> options = sc1.getOptions();

		for (WebElement webElement : options) {
			System.out.println(webElement.getText());

		}

		WebElement single3 = driver.findElement(By.id("dropdown3"));
		Select sc2 = new Select(single3);
		sc2.selectByVisibleText("Loadrunner");
		boolean multiple = sc2.isMultiple();
		System.out.println("Is This Multiple Dropdown  :" + multiple);

		WebElement single4 = driver.findElement(By.xpath("//*[@class='dropdown']"));
		Select sc3 = new Select(single4);
		sc3.selectByValue("1");
		WebElement op = sc3.getFirstSelectedOption();
		System.out.println(op.getText());

		WebElement single5 = driver.findElement(By.xpath("(//select)[5]"));
		Select sc4 = new Select(single5);
		sc4.selectByVisibleText("Selenium");
		WebElement op2 = sc4.getFirstSelectedOption();
		System.out.println(op2.getText());
		List<WebElement> allSelectedOptions = sc4.getAllSelectedOptions();
		for (WebElement webEle : allSelectedOptions) {
			System.out.println(webEle.getText());
			
		}
		Thread.sleep(3000);
		
		WebElement multi = driver.findElement(By.xpath("(//option[@selected='selected'])[1]"));
		Select s = new Select(multi);
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		// s.selectByValue("2");
		s.selectByIndex(2);
		s.deselectByVisibleText("Loadrunner");
	

		List<WebElement> SelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : SelectedOptions) {
			System.out.println(webElement.getText());

		}
	}

}
