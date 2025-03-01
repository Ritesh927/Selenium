package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowsersExceptParent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(2000);
		String ad = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		for (String wh : allWh) {
			Thread.sleep(1000);
			driver.switchTo().window(wh);
			if (ad == wh) {
				continue;
			} else {
				driver.close();
			}
		}
	}
}
