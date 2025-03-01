package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestions {
	
	public static void main(String[] args) throws InterruptedException {
		// Open the browser
		WebDriver driver = new ChromeDriver();
		// enter the url
		driver.get("https://www.google.com/");
		// type java in the search text box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		// capture all the autosuggestions and print the count
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allSugg.size();
		System.out.println(count);
		// print the text of all autosuggestions
		for (int i = 0; i < count; i++) {
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		// select the first autosuggestion
		allSugg.get(0).click();
		driver.close();
	}
}