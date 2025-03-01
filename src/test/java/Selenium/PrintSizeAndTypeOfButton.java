package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSizeAndTypeOfButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement lgBtn = driver.findElement(By.linkText("Forgotten password?"));
		String size = lgBtn.getCssValue("Font-Size");
		String type = lgBtn.getCssValue("Font-Family");
		System.out.println(size);
		System.out.println(type);
		driver.close();
	}
}