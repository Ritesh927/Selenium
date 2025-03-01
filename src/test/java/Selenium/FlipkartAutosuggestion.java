package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("i phone");
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		int count = allSugg.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		allSugg.get(count - 1).click();
		driver.close();
	}
}
