package selenium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// write a program for cross browser testing 
public class BrowserUtil {

	public WebDriver driver;

	// documentation is---
	/**
	 * This method is used to initialize the driver on the basis of given browser
	 * 
	 * @param browserName
	 * @return This returns the driver
	 */
	public WebDriver launchBrowser(String browserName) {// we have written WebDriver as return type, because the driver
														// is WebDriver return type

		System.out.println("browser name is: " + browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "D:\\eclipse-java-2021-12-R-win32-x86\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "D:\\eclipse-java-2021-12-R-win32-x86\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("please pass the correct browser: " + browserName);
		}

		return driver;
	}
	// if someone will pass incorrect browser then driver is null in return

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("please pass the right url");
			return;
		}
		if (url.contains("https") || url.contains("http")) {
			driver.get(url);// when driver is null then it look like, null.get(url);-- that give us a null
							// pointer exception
		} else {
			driver.close();
			try {
				throw new Exception("INVALIDURLEXCEPTION - please pass the right url");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void launchUrl(URL url) {
		driver.navigate().to(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
