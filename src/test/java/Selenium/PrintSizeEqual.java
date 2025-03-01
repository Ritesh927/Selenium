package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSizeEqual {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		int htun = un.getSize().getHeight();
		int wdun = un.getSize().getWidth();
		int htpass = pass.getSize().getHeight();
		int wdpass = pass.getSize().getWidth();
		if (htun == htpass && wdun == wdpass) {
			System.out.println("Height and Width of UN & Pwd are equal");
		} else {
			System.out.println("Height and Width of UN & Pwd are not equal");
		}
		driver.close();
	}
}
