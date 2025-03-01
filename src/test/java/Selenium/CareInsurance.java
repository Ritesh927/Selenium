package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthListbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 = new Select(monthListbox);
		s1.selectByValue("11");
		WebElement yearListbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 = new Select(yearListbox);
		s2.selectByValue("2000");
		driver.findElement(By.xpath("(//a)[28]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean status = driver.findElement(By.id("policynumberError")).isDisplayed();
		if (status == true) {
			System.out.println("Text displayed correctly");
		}
	}
}
