package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

		String url = driver.getCurrentUrl();

		if (url.equals("https://www.selenium.dev/"))
			System.out.println("Url is successfully navigating and pass");

		else
			System.out.println("Url is not successfully navigating and fail");
		driver.close();
	}
}