package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLoad {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		try {
			driver.get("https:/demo.actitime.com/");
			System.out.println("Page is loaded within 7 seconds");
		} catch (Exception e) {
			System.out.println("Page is not loaded within 7 seconds");
		}
		
		driver.close();
	}
}
