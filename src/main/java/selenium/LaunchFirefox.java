package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse-java-2021-12-R-win32-x86\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");//enter url
		String title = driver.getTitle(); //get thte page title -- Google
		System.out.println(title);
		
		driver.quit();
	}

}
