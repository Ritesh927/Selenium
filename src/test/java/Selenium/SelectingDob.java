package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingDob {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement dayListBox = driver.findElement(By.id("day"));
		Select s1 = new Select(dayListBox);
		Thread.sleep(2000);
		s1.selectByIndex(20);
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select s2 = new Select(monthListBox);
		Thread.sleep(2000);
		s2.selectByValue("12");
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select s3 = new Select(yearListBox);
		Thread.sleep(2000);
		s3.selectByVisibleText("2000");
		Thread.sleep(2000);
		driver.close();
	}
}
