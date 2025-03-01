package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RITESH/Desktop/HotelsMenu.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		s.selectByIndex(0);
		s.selectByVisibleText("vada");
		s.selectByValue("d");
		s.deselectByVisibleText("idly");
		s.deselectByIndex(1);
		s.deselectByValue("v");
		boolean status = s.isMultiple();
		System.out.println(status);
		driver.close();
	}
}
