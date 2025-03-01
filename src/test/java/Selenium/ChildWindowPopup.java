package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		driver.close();
	}
}
