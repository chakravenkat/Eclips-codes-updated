package kumar;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			        "C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	
}
}
