package org.firstTask;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com");
//		Driver.manage().window().maximize();
//		String title = Driver.getTitle();
//		System.out.println(title);
//		String currentUrl = Driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		Thread.sleep(3000);
//		Driver.navigate().refresh();
//Driver.navigate().to("http://mail.google.com/mail/");
//Driver.navigate().forward();
//Driver.navigate().to("https://www.cricbuzz.com/");
//
//Driver.navigate().back();
//Driver.close();
//Driver.quit();	

	}
}
