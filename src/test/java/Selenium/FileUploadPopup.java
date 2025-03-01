package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RITESH/Desktop/Naukri.html");
		File f = new File("./data/Resume.docx");
		String absolutePath = f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("cv")).sendKeys(absolutePath);
	}

}
