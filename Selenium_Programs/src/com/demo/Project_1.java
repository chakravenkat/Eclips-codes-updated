package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		WebElement signup = driver.findElement(By.xpath("//*[@class='login']"));
		signup.click();
		
		WebElement input = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		input.sendKeys("vchandru1810@gmail.com");
		driver.findElement(By.xpath("(//span)[29]")).click();
		
		
	
		driver.findElement(By.xpath("//label[@class='top']")).click();
		WebElement btn = driver.findElement(By.xpath("//*[@type='radio']"));
		btn.click();
		
		WebElement name = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		name.sendKeys("Vijay");
		
		WebElement lastname = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		lastname.sendKeys("Prakash");
		
		WebElement mail = driver.findElement(By.xpath("(//*[@type='password'])"));
		mail.sendKeys("Vasu@123");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='days']"));
		Select day= new Select(dropdown);
	    day.selectByValue("30");
	    
	    
	    Thread.sleep(3000);
	    WebElement drop1 = driver.findElement(By.xpath("//select[@name='months']"));
		Select month =new Select(drop1);
		month.selectByVisibleText("April ");
		
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='years']"));
		Select year = new Select(drop2);
		year.selectByValue("1994");
		
		
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='optin']"));
		checkbox.click();
		
		
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		company.sendKeys("Greens Technoligies");
		
		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		address.sendKeys("Karnan street,Mugappair West,mogappair post,Greens Tech,");
		
		WebElement adress1 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		adress1.sendKeys("Galaxy Apartment,First Floor,Door No : F1");
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("chenni");
		
		WebElement State = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select tamilnad=new Select(State);
		tamilnad.selectByVisibleText("New York");
		
		
		WebElement code = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		code.sendKeys("10001");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select selectcountry = new Select(country);
		selectcountry.selectByVisibleText("United States");
		
		
		WebElement other = driver.findElement(By.xpath("//textarea[@name='other']"));
		other.sendKeys("Na Oru Thadava Mudivu Pannita En Pecha Nane Keka Maten Enake Siripu VAruthu Enna Seyya");
		
		WebElement phn = driver.findElement(By.xpath("//input[@name='phone']"));
		phn.sendKeys("9786262326");
		
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("6381269075");
		WebElement Addrees = driver.findElement(By.xpath("//input[@name='alias']"));
		Addrees.sendKeys("Karnan street");
		
		
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
		
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		Object screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\Screen5.png");
		FileUtils.copyFile((File) screenshotAs, des);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
