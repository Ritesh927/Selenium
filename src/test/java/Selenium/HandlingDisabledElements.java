package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RITESH/Desktop/Disabled.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		Thread.sleep(2000);
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("document.getElementById('d2').value='manager'");
		driver.close();
	}
}