package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(src, dest).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
