package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.opensourcebilling.org/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.close();
	}
}
