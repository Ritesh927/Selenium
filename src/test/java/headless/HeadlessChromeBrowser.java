package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowser {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
		options.addArguments("--headless");// we can use this method also.

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
	}
}