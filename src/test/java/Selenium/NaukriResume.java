package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResume {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajritesh927@gmail.com");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Ritesh@927");
		driver.findElement(By.linkText("Login")).click();

	}

}
