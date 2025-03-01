package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ritesh__dangi_");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ritesh@927");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Log in']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[text()='Not now']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//button[text()='Not Now']")).click();
			Thread.sleep(10000);
		} finally {
			driver.close();
		}
	}

}