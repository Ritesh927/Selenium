package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAddressesActitime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("(//a)[7]")).click();
		Set<String> allWh = driver.getWindowHandles();
		for (String wh : allWh) {
			System.out.println(wh);
		}
		driver.quit();
	}
}
