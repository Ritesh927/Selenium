package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlSourceCode {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String htmlCode = driver.getPageSource();

		System.out.println(htmlCode);
		driver.close();
	}

}
