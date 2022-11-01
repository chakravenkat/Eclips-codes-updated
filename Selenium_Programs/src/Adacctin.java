import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adacctin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:" + "\\U" + "sers\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

		Thread.sleep(5000);
		WebElement sel = driver.findElement(By.id("username"));
		sel.sendKeys("chakravarthi");

		WebElement to = driver.findElement(By.name("password"));
		to.sendKeys("123456798");

	}
}