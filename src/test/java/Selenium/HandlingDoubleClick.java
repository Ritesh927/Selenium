package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement target = driver.findElement(By.partialLinkText("Login"));
		a.doubleClick(target).perform();
		String title = driver.getTitle();
		if (title.equals("Login - Vtiger")) {
			System.out.println("Title is successfully displayed");
		} else {
			System.out.println("Title is not successfully displayed");
		}
	}
}
