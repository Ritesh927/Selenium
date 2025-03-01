package Selenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicates {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RITESH/Desktop/HotelsMenu.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		HashSet<String> hs = new HashSet<String>();
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for (int i = 0; i < count; i++) {
			String text = allOptions.get(i).getText();
			hs.add(text);
		}
		for (String option : hs) {
			System.out.println(option);
		}
		driver.close();
	}

}
