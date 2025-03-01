package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RITESH/Desktop/HotelsMenu.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s = new Select(cpListBox);
		WebElement fsOption = s.getFirstSelectedOption();
		String text = fsOption.getText();
		System.out.println(text);
		driver.close();
	}
}
