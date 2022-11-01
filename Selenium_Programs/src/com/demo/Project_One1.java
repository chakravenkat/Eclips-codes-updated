package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_One1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(4000);
		driver.findElement(By.className("login")).click();
		Thread.sleep(3000);

		WebElement input = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		input.sendKeys("summak129@gmail.com");
		WebElement createac = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		createac.click();
		Thread.sleep(3000);

		WebElement btn = driver.findElement(By.xpath("//*[@type='radio']"));
		btn.click();

		WebElement name = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		name.sendKeys("master");

		WebElement lastname = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		lastname.sendKeys("blaster");

		WebElement mail = driver.findElement(By.xpath("(//*[@type='password'])"));
		mail.sendKeys("mayuripass@321");

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='days']"));
		Select day = new Select(dropdown);
		day.selectByValue("30");

		Thread.sleep(3000);
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='months']"));
		Select month = new Select(drop1);
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
		Select tamilnad = new Select(State);
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

		TakesScreenshot sc = (TakesScreenshot) driver;
		Object screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\Screen 05.png");
		FileUtils.copyFile((File) screenshotAs, des);

		// Mouse Hover --------> Action Class
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		action.moveToElement(women).build().perform();
		driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		WebElement printed = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		action.moveToElement(printed).build().perform();

		WebElement quick = driver.findElement(By.xpath("//a[@class='quick-view']"));
		action.moveToElement(quick).build().perform();
		action.click(quick).build().perform();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);

		for (int i = 1; i <= 8; i++) {

			WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			quantity.click();
		}

		WebElement drop = driver.findElement(By.xpath("//select[@name='group_1']"));

		// Mutiple DropDown
		Select sel = new Select(drop);
		sel.selectByValue("3");

		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		// Add To Cart
		TakesScreenshot scr = (TakesScreenshot) driver;
		Object source = scr.getScreenshotAs(OutputType.FILE);
		File des12 = new File(
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\screen07.png");
		FileUtils.copyFile((File) source, des12);

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		WebElement checkout = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		js.executeScript("arguments[0].scrollIntoView()", checkout);
		js.executeScript("arguments[0].click();", checkout);
		Thread.sleep(3000);
//		driver.findElement(By.id("email")).sendKeys("summapodrapudingi112@gmail.com");
//		driver.findElement(By.name("passwd")).sendKeys("masterblokerpunda@123");
//		driver.findElement(By.id("SubmitLogin")).click();

		WebElement address1 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		js.executeScript("arguments[0].scrollIntoview", address1);
		js.executeScript("arguments[0].click();", address1);

		WebElement ship = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].scrollIntoview", ship);

		WebElement box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		js.executeScript("arguments[0].click();", box);
		js.executeScript("arguments[0].click();", ship);

		WebElement total = driver.findElement(By.xpath("(//span[text()='Total'])[2]"));
		js.executeScript("arguments[0].scrollIntoview", total);

		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		js.executeScript("arguments[0].click();", bank);

		WebElement conformorder = driver.findElement(By.xpath("//p[@id='cart_navigation']"));
		// js.executeScript("arguments[0].scrollIntoview", conformorder);
		js.executeScript("window.scrollBy(0,300)", "");

		// Before payment
		TakesScreenshot scr2 = (TakesScreenshot) driver;
		Object sourc = scr2.getScreenshotAs(OutputType.FILE);
		File desti = new File(
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\scren09.png");
		FileUtils.copyFile((File) sourc, desti);

		WebElement order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].click();", order);

		WebElement placed = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		// js.executeScript("arguments[0].scrollIntoview", placed);
		js.executeScript("window.scrollBy(0,300)", "");

		// After payment
		TakesScreenshot scr3 = (TakesScreenshot) driver;
		Object sourc2 = scr2.getScreenshotAs(OutputType.FILE);
		File desti2 = new File(
				"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\scren08.png");
		FileUtils.copyFile((File) sourc2, desti2);

	}

}
