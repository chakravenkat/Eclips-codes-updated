import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoPractise {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/");
	Thread.sleep(3000);
	driver.findElement(By.className("login")).click();
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	user.sendKeys("chakravarthi382@gmail.com");
	WebElement pass = driver.findElement(By.name("passwd"));
	pass.sendKeys("9966352061");
	WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	submit.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
