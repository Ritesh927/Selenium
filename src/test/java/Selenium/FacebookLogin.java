package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("rajritesh927@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys("Ritesh@927kumar");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
		} finally {
			driver.close();
		}
	}
}
