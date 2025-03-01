package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PresentForEachLoop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RITESH/Desktop/HotelsMenu.html");
		List<WebElement> mtrListBox = driver.findElements(By.id("mtr"));
		for (WebElement i : mtrListBox) {
			System.out.println(i.getText());
		}
		driver.close();
	}
}
