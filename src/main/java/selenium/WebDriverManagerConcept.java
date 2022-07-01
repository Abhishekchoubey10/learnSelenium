package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// WebDriverManager.chromedriver().browserVersion("89.0").setup();// if any
		// client say we want to test our website at specific browser version than we
		// have to also have option for that 

		// WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.safaridriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
