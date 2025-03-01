package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Java");
		Thread.sleep(2000);
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allSuggestion.size();
		System.out.println("Total Suggestions: " + count);

		for (int i = 0; i < count; i++) {
			String text = allSuggestion.get(i).getText();
			System.out.println(text);
		}
		allSuggestion.get(count - 1).click();
		Thread.sleep(2000);
		driver.close();

	}
}
